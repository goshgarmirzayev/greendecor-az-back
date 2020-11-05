FROM openjdk:14-alpine
COPY target/greendecor-*.jar greendecor.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "greendecor.jar"]