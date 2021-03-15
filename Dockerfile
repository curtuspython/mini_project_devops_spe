FROM openjdk:8
COPY ./target/scientific-calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientific-calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar", "Main"]
