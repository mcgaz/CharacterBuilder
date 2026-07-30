APP = characterBuilder
VERSION = 0.0.1-SNAPSHOT

build:
	mvn clean install

run:
	java -jar target/$(APP)-$(VERSION).jar

random:
	curl http://localhost:8080/randomCharacter