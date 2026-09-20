# CSS37W2 - Microservices Lab: CRUD REST API

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2%20Database-003545?style=for-the-badge&logo=h2&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-FF0000?style=for-the-badge&logo=lombok&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

## 📖 Overview
This project is a complete RESTful Web Service built using Spring Boot. It implements a full CRUD (Create, Read, Update, Delete) API for managing a "Todo" resource, utilizing Spring Data JPA for database interaction and an H2 in-memory database for rapid testing. 

The application follows a standard Layered Architecture:
- **Model Layer:** Entities and Enums (`Todo`, `TodoStatus`).
- **Repository Layer:** Spring Data JPA interfaces (`TodoRepository`).
- **Service Layer:** Business logic (`TodoService`, `TodoServiceImpl`).
- **Controller Layer:** REST endpoints (`TodoController`).
- **Bootstrap Layer:** Initial data loader (`TodoLoader`).

## 🚀 Features & Endpoints

| Operation | HTTP Verb | Endpoint | Request Body | Status Code |
| :--- | :--- | :--- | :--- | :--- |
| Create | POST | `/api/v1/todo` | JSON (title, description, status) | 201 Created |
| Read (All) | GET | `/api/v1/todo` | None | 200 OK |
| Read (by ID) | GET | `/api/v1/todo/{todoId}` | None | 200 OK |
| Update | PUT | `/api/v1/todo/{todoId}` | JSON (updated fields) | 200 OK |
| Delete | DELETE | `/api/v1/todo/{todoId}` | None | 204 No Content |

## 🛠️ How to Run the Application

1. **Clone the repository:**
   ```bash
   git clone https://github.com/YOUR_USERNAME/CSS37W2-Lab2-CRUD-REST-API.git
