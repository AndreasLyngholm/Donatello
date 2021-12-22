# The Nuxt Web Server (Nuxt)
This is Nuxt, a dynamic web service written in <a href="https://www.jolie-lang.org/">Jolie</a>.

You can use Nuxt as is, to host dynamic content in the Nuxt Templating language or simply as a host for static pages.

Nuxt uses plain HTTP for serving content. To add encryption (HTTPS), we recommend combining it with a reverse proxy (for example, we like linuxserver/letsencrypt).

# Quickstart guide (Docker)
With Docker, you can get started very quickly. First, pull the latest image: `docker pull lyngholm/nuxt`.

```
docker run -it --rm -v "$(pwd)"/myWWW:/web -e LEONARDO_WWW=/web -p 8080:8080 lyngholm/nuxt
```
Browse to <a href="">http://localhost:8080/</a>.

# Quickstart guide (Linux)
For this part, we assume that you have <a href="https://www.jolie-lang.org/">Jolie</a> installed on you machine.

To run Nuxt, you will have to declare where the content of your web server is stored. This can be done in two ways:
- Pass the content directory as an argument. For example, if your content is in `/var/www`, then you should run the command `jolie launcher.ol /var/www`.
- Pass the content directory by using the environment variable `NUXT_WWW`. In this case, you just need to invoke `jolie launcher.ol`.
