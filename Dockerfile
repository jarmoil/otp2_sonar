FROM maven:latest
LABEL authors="Jarmo"

WORKDIR /app
COPY pom.xml /app
COPY . /app
RUN mvn package
CMD ["java", "-jar", "target/otp2_sonar-1.0-SNAPSHOT.jar"]