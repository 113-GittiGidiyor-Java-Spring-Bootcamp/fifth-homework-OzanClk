### Request

```
curl -X GET "http://localhost:8080/api/get-salary-adjustment-with-date-range/2021-09-14/2021-09-15" -H "accept: */*"
```

### Response

```java
[
  {
    "id": 1,
    "instructorId": 0,
    "previousSalary": 3000,
    "salaryAfterUpdate": 63000,
    "salaryUpdatePercentage": 20,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/3",
    "sessionActivityId": "FEF05113E06B204484A52BE88F3D1A3E",
    "requestDate": "2021-09-14"
  },
  {
    "id": 2,
    "instructorId": 0,
    "previousSalary": 4400,
    "salaryAfterUpdate": 3520,
    "salaryUpdatePercentage": 20,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/2",
    "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
    "requestDate": "2021-09-14"
  },
  {
    "id": 3,
    "instructorId": 0,
    "previousSalary": 100,
    "salaryAfterUpdate": 150,
    "salaryUpdatePercentage": 50,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/4",
    "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
    "requestDate": "2021-09-14"
  },
  {
    "id": 4,
    "instructorId": 0,
    "previousSalary": 150,
    "salaryAfterUpdate": 225,
    "salaryUpdatePercentage": 50,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/4",
    "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
    "requestDate": "2021-09-14"
  },
  {
    "id": 5,
    "instructorId": 0,
    "previousSalary": 600,
    "salaryAfterUpdate": 300,
    "salaryUpdatePercentage": 50,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/13",
    "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
    "requestDate": "2021-09-14"
  },
  {
    "id": 6,
    "instructorId": 0,
    "previousSalary": 300,
    "salaryAfterUpdate": 150,
    "salaryUpdatePercentage": 50,
    "clientIpAdress": "0:0:0:0:0:0:0:1",
    "clientUrl": "/api/instructor-salary-adjustment/13",
    "sessionActivityId": "50D360609E4B27BF00F34BD3A1BC2C40",
    "requestDate": "2021-09-14"
  },
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
]
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

