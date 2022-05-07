
FROM openjdk:8
VOLUME /tmp
EXPOSE 8000
ADD /target/FinalProject.jar the-gift-library.jar

ENTRYPOINT ["java", "-jar", "the-gift-library.jar"]
