FROM openjdk:17

WORKDIR /app

COPY target/Week11Example-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "Week11Example-0.0.1-SNAPSHOT.jar"]