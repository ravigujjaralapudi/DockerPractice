FROM openjdk:8
ADD target/springbootwithdocker-1.0.jar springbootwithdocker-1.0.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "springbootwithdocker-1.0.jar"]