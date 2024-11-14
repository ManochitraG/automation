FROM eclipse-temurin:17
COPY target/autodep.jar autodep.jar
CMD ["java", "-jar", "autodep.jar"]