### Request

```java
curl -X PUT "http://localhost:8080/api/update-instructors" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"id\":9, \"address\": \"Istanbul\", \"instructorName\": \"Ahmet\", \"phoneNumber\": 5554443312, \"salary\": 200, \"type\": \"VisitingResearcher\"}"
```

### Response

```java
{
  "id": 9,
  "instructorName": "Ahmet",
  "address": "Istanbul",
  "phoneNumber": "5554443312",
  "Courses": [],
  "courses": []
}
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

