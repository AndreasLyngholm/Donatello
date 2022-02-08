${param token?:undefined}
${param slug:string}

${use service ..app.api }
${ article@Api(slug)(article) }
${ if token != null }
    ${ me@Api(token)(auth) }
${ endif }

${ include header.ol token=token }
<div class="article-page">

    <div class="banner">
        <div class="container">

            <h1>{{ article.title }}</h1>

            <div class="article-meta">
                <a href="/profiles/{{ article.author.username }}"><img src="{{ article.author.image }}"/></a>
                <div class="info">
                    <a href="/profiles/{{ article.author.username }}">{{ article.author.username }}</a>
                    <span class="date">{{ article.createdAt }}</span>
                </div>
                
                ${ if article.author.username != auth.username and token != null }
                    <button class="btn btn-sm btn-outline-secondary">
                        <i class="ion-plus-round"></i>
                        &nbsp;
                        Follow {{ article.author.username }}
                    </button>
                    &nbsp;
                    <button class="btn btn-sm btn-outline-primary">
                        <i class="ion-heart"></i>
                        &nbsp;
                        Favorite Post <span class="counter">({{ article.favoritesCount }})</span>
                    </button>
                ${ elseif token != null }

                    <a class="btn btn-outline-secondary btn-sm" href="/editor/{{ article.slug }}">
                        <i class="ion-edit"></i> Edit Article
                    </a>

                    <button class="btn btn-outline-danger btn-sm">
                        <i class="ion-trash-a"></i> Delete Article
                    </button>

                ${ endif }
            </div>

        </div>
    </div>

    <div class="container page">

        <div class="row article-content">
            <div class="col-md-12">
                <p>
                    {{ article.body }}
                </p>
            </div>
        </div>

        <ul class="tag-list">

        ${ for tag in article.tagList }
            <li class="tag-default tag-pill tag-outline">
                {{ tag }}
            </li>
        ${ endfor }

        </ul>

        <hr/>

        <div class="article-actions">
            <div class="article-meta">
                <a href="/profiles/{{ article.author.username }}"><img src="{{ article.author.image }}"/></a>
                <div class="info">
                    <a href="/profiles/{{ article.author.username }}" class="author">{{ article.author.username }}</a>
                    <span class="date">{{ article.created_at }}</span>
                </div>

                ${ if article.author.username != auth.username and token != null }
                    <button class="btn btn-sm btn-outline-secondary">
                        <i class="ion-plus-round"></i>
                        &nbsp;
                        Follow {{ article.author.username }}
                    </button>
                    &nbsp;
                    <button class="btn btn-sm btn-outline-primary">
                        <i class="ion-heart"></i>
                        &nbsp;
                        Favorite Post <span class="counter">({{ article.favoritesCount }})</span>
                    </button>
                ${ elseif token != null }

                    <a class="btn btn-outline-secondary btn-sm" href="/editor/{{ article.slug }}">
                        <i class="ion-edit"></i> Edit Article
                    </a>

                    <button class="btn btn-outline-danger btn-sm">
                        <i class="ion-trash-a"></i> Delete Article
                    </button>

                ${ endif }
            </div>
        </div>

        <div class="row">

            <div class="col-xs-12 col-md-8 offset-md-2">

                <form name="post_comment" class="card comment-form">
                    <div class="card-block">
                        <textarea id="comment" class="form-control" placeholder="Write a comment..." rows="3"></textarea>
                    </div>
                    <div class="card-footer">
                        <img src="{{ auth.image }}" class="comment-author-img"/>
                        <button type="submit" class="btn btn-sm btn-primary">
                            Post Comment
                        </button>
                    </div>
                </form>

                ${ include comments.ol slug=slug token=token }

            </div>

        </div>

    </div>

</div>

<script>
$( document ).ready( function() {
  $("form[name=post_comment]").submit(function(e) {
    e.preventDefault();

        $.ajax({
            url: "https://api.realworld.io/api/articles/{{ article.slug }}/comments",
            headers: {
                'Authorization': 'Bearer {{ token }}'
            },
            method: "POST",
            data: { comment: { body: $("#comment").val() } }
        }).done(function( data ) {
            location.reload();
        }).fail(function($xhr) {
            document.cookie = "error=" + $xhr.responseJSON.message;
            window.location.replace("?error=true")
        });
  })
});
</script>

${ include layouts/footer.html }