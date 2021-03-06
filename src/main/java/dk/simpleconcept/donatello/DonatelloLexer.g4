lexer grammar DonatelloLexer;

@header {
package dk.simpleconcept.donatello;
}

@lexer::members {
  private boolean stripSpacesAroundTags = false;
  private boolean stripSingleLine = false;
  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
  public DonatelloLexer(CharStream charStream, boolean stripSpacesAroundTags) {
    this(charStream, stripSpacesAroundTags, false);
  }

  public DonatelloLexer(CharStream charStream, boolean stripSpacesAroundTags, boolean stripSingleLine) {
    this(charStream);
    this.stripSpacesAroundTags = stripSpacesAroundTags;
    this.stripSingleLine = stripSingleLine;
  }

  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }

  @Override
  public Token nextToken() {
    Token next = super.nextToken();
    return tokens.isEmpty() ? next : tokens.poll();
  }

  private void handleIdChain(String chain) {
    String[] ids = chain.split("\\.");
    int start = this.getCharIndex() - chain.getBytes().length;
  for (int i = 0; i < ids.length; i++) {
    int stop = start + ids[i].getBytes().length - 1;
      this.emit(new CommonToken(this._tokenFactorySourcePair, Id, DEFAULT_TOKEN_CHANNEL, start, stop));
      if (i < ids.length - 1) {
        stop += 1;
        this.emit(new CommonToken(this._tokenFactorySourcePair, Dot, DEFAULT_TOKEN_CHANNEL, stop, stop));
      }

      start = stop + 1;
  }
  }
}

OutStart
 : ( SpaceOrTab* '{{' {stripSpacesAroundTags && stripSingleLine}?
   | WhitespaceChar* '{{' {stripSpacesAroundTags && !stripSingleLine}?
   | WhitespaceChar* '{{-'
   | '{{'
   ) -> pushMode(IN_TAG)
 ;

TagStart
 : ( SpaceOrTab* '${' {stripSpacesAroundTags && stripSingleLine}?
   | WhitespaceChar* '${' {stripSpacesAroundTags && !stripSingleLine}?
   | WhitespaceChar* '${-'
   | '${'
   ) -> pushMode(IN_TAG)
 ;

Other
 : .
 ;

fragment SStr           : '\'' ~'\''* '\'';
fragment DStr           : '"' ~'"'* '"';
fragment WhitespaceChar : [ \t\r\n];
fragment SpaceOrTab     : [ \t];
fragment LineBreak      : '\r'? '\n' | '\r';
fragment Letter         : [a-zA-Z];
fragment Digit          : [0-9];

mode IN_TAG;

  OutStart2 : '{{' -> pushMode(IN_TAG);
  TagStart2 : '${' -> pushMode(IN_TAG);

  OutEnd
   : ( '}}' SpaceOrTab* LineBreak? {stripSpacesAroundTags && stripSingleLine}?
     | '}}' WhitespaceChar* {stripSpacesAroundTags && !stripSingleLine}?
     | '-}}' WhitespaceChar*
     | '}}'
     ) -> popMode
   ;

  TagEnd
   : ( '}' SpaceOrTab* LineBreak? {stripSpacesAroundTags && stripSingleLine}?
     | '}' WhitespaceChar* {stripSpacesAroundTags && !stripSingleLine}?
     | '-}' WhitespaceChar*
     | '}'
     ) -> popMode
   ;

  Str : SStr | DStr;

  DotDot    : '..';
  Dot       : '.';
  NEq       : '!=' | '<>';
  Eq        : '==';
  EqSign    : '=';
  GtEq      : '>=';
  Gt        : '>';
  LtEq      : '<=';
  Lt        : '<';
  Minus     : '-';
  Pipe      : '|';
  Col       : ':';
  Comma     : ',';
  OPar      : '(';
  CPar      : ')';
  OBr       : '[';
  CBr       : ']';
  QMark     : '?';
  Mul       : '*';
  Div       : '/';
  Plus      : '+';
  Add       : '@';
  PathSep   : [/\\];

  DoubleNum
   : '-'? Digit+ '.' Digit+
   | '-'? Digit+ '.' {_input.LA(1) != '.'}?
   ;

  LongNum   : '-'? Digit+;

  WS : WhitespaceChar+ -> channel(HIDDEN);

  Use          : 'use';
  Param        : 'param';
  Service      : 'service';
  Json         : 'json';
  Xml          : 'xml';
  As           : 'as';


  CaptureStart : 'capture';
  CaptureEnd   : 'endcapture';
  RawStart     : 'raw' WhitespaceChar* '}' -> pushMode(IN_RAW);
  ParamStart   : 'param' WhitespaceChar* Type WhitespaceChar* '{' -> pushMode(IN_PARAM);
  IfStart      : 'if';
  Elseif       : 'elseif';
  IfEnd        : 'endif';
  UnlessStart  : 'unless';
  UnlessEnd    : 'endunless';
  Else         : 'else';
  Contains     : 'contains';
  CaseStart    : 'case';
  CaseEnd      : 'endcase';
  When         : 'when';
  Cycle        : 'cycle';
  ForStart     : 'for';
  ForEnd       : 'endfor';
  In           : 'in';
  And          : 'and';
  Or           : 'or';
  TableStart   : 'tablerow';
  TableEnd     : 'endtablerow';
  Assign       : 'assign';
  True         : 'true';
  False        : 'false';
  Nil          : 'nil' | 'null';
  Include      : 'include';
  With         : 'with';
  Offset       : 'offset';
  Continue     : 'continue';
  Reversed     : 'reversed';
  Empty        : 'empty';
  Blank        : 'blank';
  EndId        : 'end' Id;

  IdChain
   : [a-zA-Z_] [a-zA-Z_0-9]* ( '.' [a-zA-Z_0-9]+ )+ {handleIdChain(getText());} -> skip
   ;

  Id : ( Letter | '_' ) (Letter | '_' | '-' | '/' | Digit)*;
  ServiceId : ( Letter | '_' | '.' ) (Letter | '_' | '-' | '/' | '.' | Digit)*;
  Type : [a-z] [a-zA-Z_0-9]*;
  ParamVar : [a-z] [a-zA-Z_0-9]* QMark? Col [a-z] [a-zA-Z_0-9]*;
  Filter : [a-z] [a-zA-Z_0-9]* Add [a-zA-Z_0-9]+;

mode IN_RAW;

  RawEnd : '${' WhitespaceChar* 'endraw' -> popMode;

  OtherRaw : . ;

mode IN_PARAM;

  ParamEnd : '}' -> popMode;

  OtherParam : . ;