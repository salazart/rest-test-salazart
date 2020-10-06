FROM arm32v7/openjdk
MAINTAINER salazart
COPY /var/lib/jenkins/workspace/rest-test-salazart2/build/libs/rest-test-salazart2-0.0.1-SNAPSHOT.jar /home/rest-test-salazart2-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/rest-test-salazart2-0.0.1-SNAPSHOT.jar"]
