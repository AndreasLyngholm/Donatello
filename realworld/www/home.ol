${ include layouts/header.html }
${use service string_utils}
${use service ..app.chuck }
${use json data/articles as data}
${use json data/tags as tags}

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
            </div>

            <div class="col-md-3">
                <div class="sidebar">
                    <p>Popular Tags</p>

                    <div class="tag-list">
                        ${ for tag in tags.tags }
                            ${ if request.tags != null }
                                ${ raw }
                                    t = request.tags
                                    t.substring = tag
                                    contains@StringUtils( t )( is_selected )
                                ${ endraw }
                            ${ else }
                                ${ is_selected = false }
                            ${ endif }

                            ${ if is_selected == false }
                                <a href="?tags=${ if request.tags != null }{{ request.tags }},${ endif }{{ tag }}" class="tag-pill tag-default">{{ tag }}</a>
                            ${ endif }
                        ${ endfor }
                    </div>
                </div>

                ${ if request.tags != null }
                    <hr>
                    <h4>Selected tags:</h4>
                    ${ raw }
                        split@StringUtils( request.tags {.regex = ","} )( tags )
                    ${ endraw }

                    ${ for tag in tags.result }

                        ${ raw }
                            replaceAll@StringUtils( request.tags {.regex = "," + tag, .replacement = ""} )( new_request )
                        ${ endraw }

                        <a href="?tags={{ new_request }}">{{ tag }}</a>
                        <br>

                    ${ endfor }
                ${ endif }
            </div>

        </div>
    </div>

</div>
${ include layouts/footer.html }