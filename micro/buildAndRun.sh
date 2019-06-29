#!/bin/sh
mvn clean package && docker build -t com.airhacks/micro .
docker rm -f micro || true && docker run -d -p 8080:8080 -p 4848:4848 --name micro com.airhacks/micro 
