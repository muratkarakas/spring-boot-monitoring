#!/bin/bash
mvn package docker:build -Dmaven.test.failure.ignore=true

docker-compose up
