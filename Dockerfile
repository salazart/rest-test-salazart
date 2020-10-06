FROM arm32v7/openjdk
MAINTAINER salazart
RUN cd build/libs/
COPY rest-test-salazart2-0.0.1-SNAPSHOT.jar /home/rest-test-salazart2-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/home/rest-test-salazart2-0.0.1-SNAPSHOT.jar"]
