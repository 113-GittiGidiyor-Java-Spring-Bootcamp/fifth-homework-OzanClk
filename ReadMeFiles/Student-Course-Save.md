### Request

```java
curl -X POST "http://localhost:8080/api/students-save-in-the-course/10/2" -H "accept: */*"
```

### Response

```java
{
  "id": 12,
  "courseName": "Science16",
  "courseCode": "Sci-16",
  "courseCredit": 6,
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