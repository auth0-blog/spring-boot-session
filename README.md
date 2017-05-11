## Scaling JSF applications with Spring Session

Useful commands:

```bash
# run app locally
mvn spring-boot:run

# prepare to dockerize
mvn clean package

# create Docker image
docker build -t spring-session .

# run docker image
docker run -d -p 8080:8080 --name spring-session spring-session

# stop and remove docker instance
docker rm -f spring-session

# getting application logs
docker logs spring-session
```