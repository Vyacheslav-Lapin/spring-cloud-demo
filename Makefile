.DEFAULT_GOAL := update

build:
	./mvnw clean package

test:
	./mvnw test

update:
	./mvnw versions:update-properties versions:display-plugin-updates
