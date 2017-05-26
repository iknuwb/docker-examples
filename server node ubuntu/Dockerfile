FROM ubuntu
RUN apt-get update && apt-get upgrade -y  --no-install-recommends \
	curl \
	&& curl -sL https://deb.nodesource.com/setup_7.x | bash - \
	&& apt-get install -y nodejs
WORKDIR /var/www
COPY index.js .
EXPOSE 3000
CMD nodejs index.js
