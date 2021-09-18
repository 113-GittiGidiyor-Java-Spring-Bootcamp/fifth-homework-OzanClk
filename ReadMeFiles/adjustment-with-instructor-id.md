### Request

```java
curl -X GET "http://localhost:8080/api/get-salary-adjustment-with-instructorId/13" -H "accept: */*"
```

### Response

```java
{
  "id": 7,
  "instructorId": 13,
  "previousSalary": 150,
  "salaryAfterUpdate": 75,
  "salaryUpdatePercentage": 50,
  "clientIpAdress": "0:0:0:0:0:0:0:1",
  "clientUrl": "/api/instructor-salary-adjustment/13",
  "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
  "requestDate": "2021-09-14"
}
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

