### Request

```java
curl -X POST "http://localhost:8080/api/save-courses" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"courseCode\": \"Sci-16\", \"courseCredit\": 6, \"courseName\": \"Science16\", \"instructorId\": 6}"
```

### Response

```java
{
   "id":10,
   "courseName":"Science",
   "courseCode":"Sci-1",
   "courseCredit":6,
   "students":[
      {
         "id":2,
         "name":"Selin",
         "birthDate":"1995-01-17",
         "address":"Bursa",
         "gender":"FEMALE"
      }
}       
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```