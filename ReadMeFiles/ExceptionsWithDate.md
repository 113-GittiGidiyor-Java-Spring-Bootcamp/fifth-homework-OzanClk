### Request

```java
curl -X GET "http://localhost:8080/api/get-logs-by-date/2021-09-08/2021-09-10" -H "accept: */*"
```

### Response

```java
[
  {
    "id": 9,
    "message": "Found more than 1 Instructor with this number",
    "statusCode": 400
  },
  {
    "id": 10,
    "message": "Found more than 1 Instructor with this number",
    "statusCode": 400
  },
  {
    "id": 11,
    "message": "Student Age Not Valid",
    "statusCode": 400
  },
  {
    "id": 12,
    "message": "Student Age Not Valid",
    "statusCode": 400
  },{
    "id": 21,
    "message": "Found more than 1 Instructor with this number",
    "statusCode": 400
  },
  {
    "id": 22,
    "message": "Student Age Not Valid",
    "statusCode": 400
  },
  {
    "id": 23,
    "message": "Sci-1 There are courses registered in this code",
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

