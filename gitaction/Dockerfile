FROM openjdk:17
EXPOSE 8080
ADD gitaction/target/githubactionpoc.jar githubactionpoc.jar
ENTRYPOINT ["java","-jar","/githubactionpoc.jar"]