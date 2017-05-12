## Scaling JSF applications with Spring Session

## Application commands

```bash
# run app locally
mvn spring-boot:run

# prepare to dockerize
mvn clean package

# create dockerized app image
docker build -t spring-session .

# run dockerized app
docker run -d -p 8081:8080 --name spring-session-1 -e "APPLICATION_TITLE=First instance" spring-session
docker run -d -p 8082:8080 --name spring-session-2 -e "APPLICATION_TITLE=Second instance" spring-session

# stop and remove docker instance
docker rm -f spring-session-1
docker rm -f spring-session-2

# getting application logs
docker logs spring-session
```

## NGINX commands

```bash
# create dockerized nginx image
docker build -t spring-session-nginx nginx

# run dockerized nginx
docker run -p 8080:80 -d --name spring-session-nginx spring-session-nginx

# stop and remove docker instance
docker rm -f spring-session-nginx

# getting nginx logs
docker logs spring-session-nginx
```

## Redis commands

```bash
# create dockerized redis image
docker build -t spring-session-redis redis

# run dockerized redis
docker run -p 6379:6379 -d --name spring-session-redis spring-session-redis

# stop and remove docker instance
docker rm -f spring-session-redis

# getting nginx logs
docker logs spring-session-redis
```