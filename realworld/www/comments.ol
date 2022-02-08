${use service ..app.api }

${ param slug?:string }
${ param token?:string }

${ parameter.slug = slug }
${ parameter.token = token }
${ comments@Api(parameter)(response) }

${ for comment in response.comments }
    <div class="card">
        <div class="card-block">
            <p class="card-text">{{ comment.body }}</p>
        </div>
        <div class="card-footer">
            <a href="" class="comment-author">
                <img src="{{ comment.author.image }}" class="comment-author-img"/>
            </a>
            &nbsp;
            <a href="/profiles/{{ comment.author.username }}" class="comment-author">{{ comment.author.username }}</a>
            <span class="date-posted">{{ comment.createdAt }}</span>
            
            <span class="mod-options">
              <i class="ion-edit"></i>
              <i class="ion-trash-a"></i>
            </span>
        </div>
    </div>
${ endfor }