${param token?:undefined}
${param slug:string}

${use service ..app.api }
${ article@Api(slug)(article) }
${ if token != null}
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
                    <a href="/profiles/{{ article.author.username }}"></a>
                    <span class="date">{{ article.createdAt }}</span>
                </div>
                
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

        <hr/>

        <div class="article-actions">
            <div class="article-meta">
                <a href="/profiles/{{ article.author.username }}"><img src="{{ article.author.image }}"/></a>
                <div class="info">
                    <a href="/profiles/{{ article.author.username }}" class="author">{{ article.author.username }}</a>
                    <span class="date">{{ article.created_at }}</span>
                </div>

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
            </div>
        </div>

        <div class="row">

            <div class="col-xs-12 col-md-8 offset-md-2">

                <form class="card comment-form">
                    <div class="card-block">
                        <textarea id="comment" class="form-control" placeholder="Write a comment..." rows="3"></textarea>
                    </div>
                    <div class="card-footer">
                        <img src="{{ auth.image }}" class="comment-author-img"/>
                        <button class="btn btn-sm btn-primary">
                            Post Comment
                        </button>
                    </div>
                </form>

                ${ include comments.ol slug=slug token=token }

            </div>

        </div>

    </div>

</div>
${ include layouts/footer.html }