FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/auth-service-0.0.1.jar auth-service.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /auth-service.jar" ]


#FROM openjdk:8
#COPY target/auth-service.jar  auth-service.jar
#EXPOSE 8080
#CMD ["java", "-jar", "auth-service.jar"]
