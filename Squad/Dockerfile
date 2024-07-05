FROM openjdk:17-jdk
WORKDIR /app
EXPOSE 8089
ADD target/Squad-0.0.1-SNAPSHOT.jar Squad-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Squad-0.0.1-SNAPSHOT.jar"]