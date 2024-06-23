# Spring boot webapp

## Steps to run

- Build the project and generate jar file
- ./mvnw package (or) mvn package 
- test webapp
- java -jar target/webapp-0.0.1-SNAPSHOT.jar

- Run spring boot app using maven
- mvn spring-boot:run
- or (the below method does not require a global maven installation, making it ideal for containers)
- ./mvnw spring-boot:run
- Build the Docker Image
- docker build --platform linux/amd64 -t webapp .
- Run the container
- docker run -p 8080:8080 -t webapp
- Deploy the kubernete service and deployment
- kubectl apply -f deployment.yaml
- kubectl apply -f service.yaml
- Collect information regarding the pod
- kubectl describe pod 'podname'


### Reference
https://www.docker.com/blog/kickstart-your-spring-boot-application-development/