# Criar endpoint ping com método GET
_Exported on 7/30/2025 at 19:55:58 GMT-3 from Cursor (1.3.5)_

---

**User**

crie um novo endpoint com nome ping com o metodo http get que retorna http code 200 e uma string pong

---

**Cursor**

I'll help you create a new endpoint named "ping" with HTTP GET method that returns HTTP code 200 and the string "pong". Let me first examine the current controller file to understand the structure.


Now I'll add the new ping endpoint to the controller. I'll add it after the existing index method.


```java
package com.ai;

import io.micronaut.http.annotation.*;

@Controller("/first-ai-micronaut-project")
public class FirstAiMicronautProjectController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }

    @Get(uri="/ping", produces="text/plain")
    public String ping() {
        return "pong";
    }
}
```

Perfect! I've successfully added the new ping endpoint to your controller. Here's what I created:

- **Endpoint**: `/first-ai-micronaut-project/ping`
- **HTTP Method**: GET
- **Response**: Returns the string "pong"
- **HTTP Status Code**: 200 (default for successful GET requests in Micronaut)
- **Content Type**: text/plain

The endpoint is now ready to use. When you make a GET request to `/first-ai-micronaut-project/ping`, it will return "pong" with HTTP status code 200.

---

**User**

altere o endpoint ping para retornar um json com um atributo pong e o valor no formato date-time com o momento da geraçao

---

**Cursor**

I'll modify the ping endpoint to return a JSON response with a "pong" attribute containing the current date-time. Let me update the controller.


```java
package com.ai;

import io.micronaut.http.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller("/first-ai-micronaut-project")
public class FirstAiMicronautProjectController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }

    @Get(uri="/ping", produces="application/json")
    public Map<String, String> ping() {
        String currentDateTime = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        return Map.of("pong", currentDateTime);
    }
}
```

Perfect! I've successfully modified the ping endpoint. Here are the changes I made:

1. **Added imports**: 
   - `LocalDateTime` for getting current date-time
   - `DateTimeFormatter` for formatting the date-time
   - `Map` for creating the JSON response

2. **Modified the endpoint**:
   - Changed `produces` from `"text/plain"` to `"application/json"`
   - Changed return type from `String` to `Map<String, String>`
   - The method now returns a JSON object with a "pong" attribute containing the current date-time in ISO format

Now when you make a GET request to `/first-ai-micronaut-project/ping`, it will return a JSON response like:
```json
{
  "pong": "2024-01-15T14:30:45.123"
}
```

The date-time is formatted using ISO_LOCAL_DATE_TIME format, which provides a standard, readable timestamp.

```json
{
  "pong": "2024-01-15T14:30:45.123"
}
```

