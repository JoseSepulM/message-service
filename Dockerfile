FROM openjdk:21-ea-24-oracle

WORKDIR /app

COPY target/servicio-mensaje-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 3291

CMD ["java", "-jar", "app.jar"]
