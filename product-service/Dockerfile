FROM openjdk:14-alpine
COPY target/book-service-*.jar book-service.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "book-service.jar"]