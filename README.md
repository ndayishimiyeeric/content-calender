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

####
```http request
# Get Details (Home)
GET /
```

```http request
# Get All contents
GET /api/content/
```

```http request
# Get a specific content
GET /api/content/{{id}}
```

```http request
# Add a new content
POST /api/content/
Content-Type: application/json
{
  "id": null,
  "title": String,
  "desc": String,
  "url": String,
  "status": enum["IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"],
  "contentType": enum["ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"],
  "dateCreated": "",
  "dateUpdated": null
}
```

```http request
# Update existing content
PUT /api/content/{{id}}
Content-Type: application/json
{
  "id": null,
  "title": String,
  "desc": String,
  "url": String,
  "status": enum["IDEA", "IN_PROGRESS", "COMPLETED", "PUBLISHED"],
  "contentType": enum["ARTICLE", "VIDEO", "COURSE", "CONFERENCE_TALK"],
  "dateCreated": "",
  "dateUpdated": null
}
```

```http request
# Delete existing content
DELETE /api/content/{{id}}
```

```http request
# Filter by keyword
GET /api/content/filter/{{keyword}}
```

```http request
# Filter by status
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