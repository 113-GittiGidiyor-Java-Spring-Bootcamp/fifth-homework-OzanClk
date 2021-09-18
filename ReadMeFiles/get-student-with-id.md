### Request

```
curl -X GET "http://localhost:8080/api/get-students/3" -H "accept: */*"
```

### Response

```java
{
   "id":3,
   "name":"Buse",
   "birthDate":"1998-11-12",
   "address":"Ankara",
   "gender":"FEMALE",
   "courses":[
      {
         "id":4,
         "courseName":"Biology",
         "courseCode":"Bio-1",
         "courseCredit":4
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

