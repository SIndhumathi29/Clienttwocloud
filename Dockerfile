FROM openjdk:11
ADD target/clienttwo.jar clienttwo.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","clienttwo.jar"]