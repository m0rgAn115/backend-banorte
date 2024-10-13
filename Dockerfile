#Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER eazybytes.com
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="morgan115dev.com"

EXPOSE 8080

# Add the application's jar to the image
COPY target/backend-0.0.1-SNAPSHOT.jar backend-0.0.1-SNAPSHOT.jar.jar

# execute the application
ENTRYPOINT ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar.jar"]