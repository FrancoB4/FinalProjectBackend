FROM amazoncorretto:19-al2-jdk
MAINTAINER emaaristimuno
COPY target/portfolio-SPRINGBOOT.jar portfolio-SPRINGBOOT.jar
ENTRYPOINT ["java","-jar","/portfolio-SPRINGBOOT.jar"]