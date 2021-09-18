### Request

```java
curl -X GET "http://localhost:8080/api/get-instructors" -H "accept: */*"
```

### Response

```java
[
   {
      "id":9,
      "instructorName":"Mustafa",
      "address":"Istanbul",
      "phoneNumber":"5554443312",
      "Courses":[
         
      ],
      "courses":[
         
      ]
   },
   {
      "id":4,
      "instructorName":"Ayşe",
      "address":"Eskisehir",
      "phoneNumber":"555311132",
      "Courses":[
         {
            "id":4,
            "courseName":"Biology",
            "courseCode":"Bio-1",
            "courseCredit":4
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

