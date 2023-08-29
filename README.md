# Content Calender Spring RESP API

_This project showcases the power of Java and Spring Boot, 
combined with a Postgres database, to create a versatile 
and efficient API for managing various types of content.
This project is used for learning and experimentation._

Built With:

- Java
- Spring Boot
- Postgres Database

Key Features:

- Use Spring Data JDBC
- REST API
- CRUD + Filtering functionalities

### Endpoints

### Get Details (Home)
```http request
GET /
```

### Get All contents
```http request
GET /api/content/
```

### Get a specific content
```http request
GET /api/content/{{id}}
```

### Add a new content

- _enum status  "IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"_
- _enum contentType "ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"_
```http request
POST /api/content/
Content-Type: application/json
{
  "id": null,
  "title": "",
  "desc": "",
  "url": "",
  "status": "",
  "contentType": "",
  "dateCreated": "",
  "dateUpdated": null
}
```

### Update existing content

- _enum status  "IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"_
- _enum contentType "ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"_
```http request
PUT /api/content/{{id}}
Content-Type: application/json
{
  "id": null,
  "title": "",
  "desc": "",
  "url": "",
  "status": "",
  "contentType": "",
  "dateCreated": "",
  "dateUpdated": null
}
```

### Delete existing content
```http request
DELETE /api/content/{{id}}
```

### Filter by keyword
```http request
GET /api/content/filter/{{keyword}}
```

### Filter by status
```http request
GET /api/content/filter/status/{{status}}
```

## Author

👤 **Odaltoneric**

- GitHub: [@ndayishimiyeeric](https://github.com/ndayishimiyeeric)
- Twitter: [@odaltongain](https://twitter.com/odaltongain)
- LinkedIn: [Ndayishimiye Eric](https://linkedin.com/in/nderic)

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

## Show your support

Give a ⭐️ if you like this project!
