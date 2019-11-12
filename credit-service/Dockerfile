FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/credit-service-0.0.1-SNAPSHOT.jar credit-service.jar
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /credit-service.jar" ]


#FROM openjdk:8
#COPY target/orders_service.jar  orders_service.jar
#EXPOSE 8080
#CMD ["java", "-jar", "customer_service.jar"]
