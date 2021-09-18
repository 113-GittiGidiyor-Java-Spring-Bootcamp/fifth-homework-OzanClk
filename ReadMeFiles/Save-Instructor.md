### Request

```java
curl -X POST "http://localhost:8080/api/save-instructors" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"address\": \"Istanbul\", \"instructorName\": \"Mustafa\", \"phoneNumber\": 555444342312, \"salary\": 200, \"type\": \"VisitingResearcher\"}"
```

### Response

```java
{
  "type": "VisitingResearcher",
  "id": 14,
  "instructorName": "Mustafa",
  "address": "Istanbul",
  "phoneNumber": "555444342312",
  "Courses": [],
  "salary": 200,
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

