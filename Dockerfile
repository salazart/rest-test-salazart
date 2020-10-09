FROM arm32v7/openjdk
MAINTAINER salazart
COPY ~/rest-test-salazart-0.0.1-SNAPSHOT.jar /home/rest-test-salazart-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/rest-test-salazart-0.0.1-SNAPSHOT.jar"]
