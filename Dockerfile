FROM openjdk:8
COPY ./target/scientific-calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "scientific-calculator-devops-1.0-SNAPSHOT.jar", "Main"]
