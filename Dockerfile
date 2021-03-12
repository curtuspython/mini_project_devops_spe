FROM openjdk:8
COPY ./target/scientific-calculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "target/scientific-calculator-devops-1.0-SNAPSHOT.jar", "scientificcalculator.Main"]
