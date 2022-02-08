${use service ..app.api }

${ param slug?:string }
${ param token?:string }

${ parameter.slug = slug }
${ parameter.token = token }
${ comments@Api(parameter)(response) }

${ for data in response.comments }
    <div class="card">
        <div class="card-block">
            <p class="card-text">{{ data.body }}</p>
        </div>
        <div class="card-footer">
            <a href="" class="comment-author">
                <img src="{{ data.author.image }}" class="comment-author-img"/>
            </a>
            &nbsp;
            <a href="/profiles/{{ data.author.username }}" class="comment-author">{{ data.author.username }}</a>
            <span class="date-posted">{{ data.createdAt }}</span>
            
            <span class="mod-options">
              <i class="ion-edit"></i>
              <i class="ion-trash-a"></i>
            </span>
        </div>
    </div>
${ endfor }