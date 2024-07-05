Hacken Test Task
---
This small application can read specific scv files and search data in db by criteria.
App process Pet objects. Class Pet is contained in com/hacken/ocherepnin/test_task/domain package.
Pet keeps such fields as:
```
    UUID id 
    String name
    String breed
    String description;
    int age
    int weight
```

Requirements:
- Docker
- Postman app

Endpoints:
- http://localhost:8080/pet/upload
- http://localhost:8080/pet/search
- http://localhost:8080/swagger-ui/index.html
- http://localhost:8080/api-docs.yaml

Step 1:
--
Run docker-compose.yml

Step 2:
--
Start application

Step 3:
--
In root package contained pets.csv file with mock data for manual testing.
    To send it, you should open Postman, create Post method to url below. 
    In request body you should choose binary and select pets.csv file.
    
http://localhost:8080/pet/upload

Step 4:
--
 After that, you can search data by name, breed or desc parameters.
To do it you should create Get method in Postman. Instead of $param you can put key word for searching data.

http://localhost:8080/pet/search?param={$param}

