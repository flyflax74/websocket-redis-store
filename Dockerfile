
FROM maslick/minimalka:jdk11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} websocket-redis-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/websocket-redis-0.0.1-SNAPSHOT.jar"]