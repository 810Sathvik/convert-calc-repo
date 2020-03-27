
FROM openjdk:8-jdk-alpine

EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/convert-calc-api-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} convert-calc-api.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","/convert-calc-api.jar"]
