### Request

```java
curl -X PUT "http://localhost:8080/api/update-students" -H "accept: */*" -H "Content-Type: application/json" -d "{\"id\":5, \"address\": \"Ankara\", \"birthDate\": \"01-01-1993\", \"gender\": \"MALE\", \"name\": \"Mehmet\"}"
```

### Response

```java
{
  "id": 5,
  "name": "Mehmet",
  "birthDate": "1993-01-01",
  "address": "Ankara",
  "gender": "MALE",
  "courses": null
}
```

##### Response headers

```java
 connection: keep-alive 
 content-type: application/json 
 keep-alive: timeout=60 
 transfer-encoding: chunked 
```

