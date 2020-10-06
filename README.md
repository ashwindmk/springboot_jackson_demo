# Spring Boot Jackson

Demo project.

### Run

```
cd /<path/to/project>/

mvn clean package

java -jar target/jackson-demo-0.0.1.jar
```

### Sample Requests

```curl
curl --location --request POST 'http://localhost:8080/student/reflect' \
--header 'Content-Type: application/json' \
--data-raw '{
    "student_id": 1,
    "name": "Ashwin",
    "email": "ashwin@gmail.com",
    "major": "maths",
    "minor": "computer",
    "response": {
        "message": "json"
    },
    "request": "{\"scheme\":\"http\"}",
    "extra": "Woohoo",
    "vehicle": {
        "type": "car",
        "name": "Tata"
    },
    "married": false,
    "custom": {
        "department": "BTech",
        "year": 2
    }
}'
```
