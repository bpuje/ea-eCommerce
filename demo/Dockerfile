FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/demo-0.0.1-SNAPSHOT.jar demo-service-v1.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /demo-service-v1.jar" ]



#FROM openjdk:8
#COPY target/orders_service.jar  orders_service.jar
#EXPOSE 8080
#CMD ["java", "-jar", "orders_service.jar"]
