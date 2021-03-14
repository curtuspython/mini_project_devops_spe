FROM openjdk:8
COPY ./target/scientific-calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "cdscientific-calculator-devops-1.0-SNAPSHOT.jar", "Main"]
