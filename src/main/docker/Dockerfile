FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD spring-boot-monitoring-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh