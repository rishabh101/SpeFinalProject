
FROM openjdk:8
VOLUME /tmp
EXPOSE 8000
copy ./FinalProject.jar /.

CMD ["java","-jar","FinalProject.jar"]


