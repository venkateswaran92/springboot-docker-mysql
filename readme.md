#Spring Boot and MySQL as Database

### maven buid

```
mvn clean package
```

### Launching MySQL using Docker

```
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=todos-user --env MYSQL_PASSWORD=dummytodos --env MYSQL_DATABASE=todos --name mysql --publish 3306:3306 --network=web-application-mysql-network --volume mysql-database-volume:/var/lib/mysql  mysql:5.7
```

### Launching Web App using Docker

```
docker container run -p 8080:8080 --network=web-application-mysql-network -e RDS_HOSTNAME=mysql  venkatpakalon/springboot-docker-mysql:0.0.1-SNAPSHOT
```


### Docker-compose

```
docker-Compose up
```
