### Request

```java
curl -X GET "http://localhost:8080/api/get-instructors/8" -H "accept: */*"
```

### Response

```java
{
  "id": 8,
  "instructorName": "Kamil",
  "address": "Istanbul",
  "phoneNumber": "5554433113",
  "Courses": [],
  "salary": 2000,
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

