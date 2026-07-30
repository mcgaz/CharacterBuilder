FROM eclipse-temurin:21-alpine

ENV APP=characterBuilder
ENV VERSION=0.0.1-SNAPSHOT

RUN mkdir /opt/app
WORKDIR /opt/app

COPY target/ .

CMD ["java", "-jar target/$(APP)-$(VERSION).jar"]
