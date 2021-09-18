### Request

```java
curl -X GET "http://localhost:8080/api/get-logs-by-errorType/400" -H "accept: */*"
```

### Response

```java
[
 
  {
    "id": 22,
    "message": "Student Age Not Valid",
    "statusCode": 400
  },
  {
    "id": 23,
    "message": "Sci-1 There are courses registered in this code",
    "statusCode": 400
  },
  {
    "id": 24,
    "message": "Student Age Not Valid",
    "statusCode": 400
  }
]
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

