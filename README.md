# Spring Boot MongoDB Example

Adjust `application.properties` for your database.

Start application with

```
./gradlew bootRun
```

Add some data
```
curl -X PUT -H "Content-Type: application/json" -d '{"text": "hello world!"}' localhost:8080
```

Query the data
```
curl localhost:8080
```