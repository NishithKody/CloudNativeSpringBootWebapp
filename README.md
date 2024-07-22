# Spring boot webapp

## Important commands

- install Dependencies
- mvn install
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
- Start the deployment
- kubectl apply -f .\deployment\deployment.yaml

### Ops
- MySQL image
- docker run -d -e MYSQL_ROOT_PASSWORD=secret -e MYSQL_DATABASE=taskdb --name mysqldb -p 3307:3306 mysql:8.0


### Reference
https://www.docker.com/blog/kickstart-your-spring-boot-application-development/
https://medium.com/@abhinavv.singh/implementing-user-authentication-in-a-spring-boot-application-a-detailed-step-by-step-guide-b15a9877569b

https://dev.to/abhi9720/a-comprehensive-guide-to-jwt-authentication-with-spring-boot-117p

https://medium.com/@tericcabrel/implement-jwt-authentication-in-a-spring-boot-3-application-5839e4fd8fac

https://medium.com/javarevisited/spring-boot-securing-api-with-basic-authentication-bdd3ad2266f5

https://howtodoinjava.com/spring-boot2/security-rest-basic-auth-example/

https://medium.com/javarevisited/spring-boot-securing-api-with-basic-authentication-bdd3ad2266f5

https://onairotich.medium.com/deploying-and-managing-application-with-kubernetes-16b37cd2c1e6

### Progress
- Spring Boot rest API
- User Auth
- Containerize the app
- Multi pod deployment

### Todo
- Auth
- Validations

### info
- Deployed multi container pod with kubernetes

### Learn
- repo
- security
- jpa vs hibernate

### troubleshooting
docker image push error 
docker login --username=your_username --email=name@email.com docker.io

if it still does not work, tag your image with your userid

docker build -t nishithkody0514/webapp:v2 .
docker push nishithkody0514/webapp:v2  

portforwarding - for local dev, to connect to a pod without a service, use port forwarding
kubectl port-forward pod/webapp2 8080:8080

service while using minikube
minikube service webapp-service
