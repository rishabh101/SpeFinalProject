
FROM openjdk:8
VOLUME /tmp
EXPOSE 8000
COPY ./FinalProject.jar /.

CMD ["java","-jar","FinalProject.jar"]


