FROM openjdk:23-jdk-oraclelinux8

COPY target/demo-ritchie-0.0.1-SNAPSHOT.jar /demo.jar

CMD ["java", "-jar", "/demo.jar"]