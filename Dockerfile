
FROM openjdk:8
VOLUME /tmp
EXPOSE 8000
ADD target/FinalProject-0.0.1-SNAPSHOT.jar FinalProject-0.0.1-SNAPSHOT.jar 

CMD ["java","-jar","FinalProject-0.0.1-SNAPSHOT.jar"]


