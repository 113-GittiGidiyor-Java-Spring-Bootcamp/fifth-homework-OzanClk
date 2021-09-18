### Request

```java
curl -X POST "http://localhost:8080/api/instructor-salary-adjustment/4?adjustmentPercentage=30&operationType=%2B" -H "accept: */*"
```

### Response

```java
{
  "id": 8,
  "instructorId": 4,
  "previousSalary": 225,
  "salaryAfterUpdate": 292.5,
  "salaryUpdatePercentage": 30,
  "clientIpAdress": "0:0:0:0:0:0:0:1",
  "clientUrl": "/api/instructor-salary-adjustment/4",
  "sessionActivityId": "E96AAB359A6E93B80A90F1EF8D7309D3",
  "requestDate": "2021-09-18"
}
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

