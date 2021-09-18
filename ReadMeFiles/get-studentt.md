### Request

```java
curl -X GET "http://localhost:8080/api/get-students" -H "accept: */*"
```

### Response

```java
[
   {
      "id":2,
      "name":"Selin",
      "birthDate":"1995-01-17",
      "address":"Bursa",
      "gender":"FEMALE",
      "courses":[
         {
            "id":4,
            "courseName":"Biology",
            "courseCode":"Bio-1",
            "courseCredit":4
         }
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

