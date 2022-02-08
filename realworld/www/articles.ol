${use service ..app.api }
${param feed:undefined }
${param token?:string }
${param tag?:undefined }

${ if feed == null }
    ${request.tag = tag}
    ${request.token = token}
    ${ articles@Api(request)(response) }
${ endif }

${ if feed == "me" }
    ${request.token = token}
    ${ feed@Api(request)(response) }
${ endif }


${ for article in response.articles }
    <div class="article-preview">
        <div class="article-meta">
            <a href="profile.html"><img src="{{ article.author.image }}"/></a>
            <div class="info">
                <a href="/profiles/{{ article.author.username }}" class="author">{{ article.author.username }}</a>
                <span class="date">{{ article.created_at }}</span>
            </div>
            <button class="btn btn-outline-primary btn-sm pull-xs-right">
                <i class="ion-heart"></i> {{ article.favoritesCount }}
            </button>
        </div>
        <a href="/article/{{ article.slug }}" class="preview-link">
            <h1>{{ article.title }}</h1>
            <p>{{ article.description }}</p>
            <span>Read more...</span>
        </a>
    </div>
${ endfor }