### Request

```java
curl -X PUT "http://localhost:8080/api/update-courses" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"id\":7, \"courseCode\": \"Sci-1\", \"courseCredit\": 4, \"courseName\": \"Science\", \"instructorId\": 6}"
```

### Response

```java
{
  "id": 7,
  "courseName": "Science",
  "courseCode": "Sci-1",
  "courseCredit": 4,
  "students": null
}
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

