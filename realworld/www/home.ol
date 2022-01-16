${ include layouts/header.html }
${use service string_utils}
${use json data/articles as data}
<div class="home-page">

    <div class="banner">
        <div class="container">
            <h1 class="logo-font">conduit</h1>
            <p>A place to share your knowledge.</p>
        </div>
    </div>

    <div class="container page">
        <div class="row">

            <div class="col-md-9">
                <div class="feed-toggle">
                    <ul class="nav nav-pills outline-active">
                        <li class="nav-item">
                            <a class="nav-link disabled" href="">Your Feed</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="">Global Feed</a>
                        </li>
                    </ul>
                </div>

                ${ for article in data.articles }
                    <div class="article-preview">
                        <div class="article-meta">
                            <a href="/profiles/{{ article.author.id }}"><img src="{{ article.author.image }}"/></a>
                            <div class="info">
                                <a href="/profiles/{{ article.author.id }}" class="author">{{ article.author.name }}</a>
                                <span class="date">{{ article.date }}</span>
                            </div>
                            <button class="btn btn-outline-primary btn-sm pull-xs-right">
                                <i class="ion-heart"></i> {{ article.likes }}
                            </button>
                        </div>
                        <a href="/articles/{{ article.author.id }}" class="preview-link">
                            <h1>{{ article.title }}</h1>
                            <p>{{ article.content }}</p>
                            <span>Read more...</span>
                        </a>
                    </div>
                ${ endfor }

            </div>

            <div class="col-md-3">
                <div class="sidebar">
                    <p>Popular Tags</p>

                    <div class="tag-list">
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }programming" class="tag-pill tag-default">programming</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }javascript" class="tag-pill tag-default">javascript</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }emberjs" class="tag-pill tag-default">emberjs</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }angularjs" class="tag-pill tag-default">angularjs</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }react" class="tag-pill tag-default">react</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }mean" class="tag-pill tag-default">mean</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }node" class="tag-pill tag-default">node</a>
                        <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }rails" class="tag-pill tag-default">rails</a>
                    </div>
                </div>

                ${ if request.tags != null }
                    <b>Selected tags: {{ request.tags }}</b>
                ${ endif }
            </div>

        </div>
    </div>

</div>
${ include layouts/footer.html }