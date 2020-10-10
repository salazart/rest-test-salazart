FROM arm32v7/openjdk
MAINTAINER salazart
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
CMD ["java","-jar","/app.jar"]
