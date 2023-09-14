FROM jdk:8
VOLUME /tmp
ADD target/jenkins-demo.jar app.jar
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","--spring.profiles.active=prd"]