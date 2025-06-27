FROM openjdk:17-jdk-slim

EXPOSE 8080

ADD build/libs/net_springboot_rest-0.0.1-SNAPSHOT.jar myApp1.jar

CMD ["java", "-jar", "myApp1.jar"]

