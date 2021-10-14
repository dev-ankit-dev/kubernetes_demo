FROM openjdk:8
EXPOSE 9002
ADD target/lucky_demo.jar lucky_demo.jar 
ENTRYPOINT ["java","-jar","/lucky_demo.jar"]