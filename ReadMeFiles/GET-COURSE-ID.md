### Request

```java
curl -X GET "http://localhost:8080/api/get-courses/6" -H "accept: */*"
```

### Response

```java
{
   "id":6,
   "courseName":"History",
   "courseCode":"His-1",
   "courseCredit":4,
   "students":[
      {
         "id":3,
         "name":"Buse",
         "birthDate":"1998-11-12",
         "address":"Ankara",
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

