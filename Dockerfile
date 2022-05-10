
FROM openjdk:8

EXPOSE 8000
COPY /workspace/FinalProject/back-end/FinalProject/target/FinalProject-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","FinalProject-0.0.1-SNAPSHOT.jar"]


