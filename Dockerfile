FROM openjdk:20
EXPOSE 8080
ADD target/Week3.1.jar Week3.1.jar
ENTRYPOINT [ "java","-jar","/Week3.1.jar" ]