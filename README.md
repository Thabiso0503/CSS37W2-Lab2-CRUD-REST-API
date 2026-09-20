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

This project is a CRUD REST API developed as part of the **CSS37W2 - Microservices Lab**.

The application is built using **Spring Boot** and provides a RESTful web service for managing a `Todo` resource. It demonstrates how a backend server can communicate with clients such as Postman, web applications, and mobile applications through REST endpoints.

The project implements the four main CRUD operations:

- **Create**
- **Read**
- **Update**
- **Delete**

## 🎯 Objectives

The main objectives of this lab are to:

- Understand REST API fundamentals
- Create a Spring Boot application
- Configure an H2 database
- Use Spring Data JPA for database interaction
- Create an entity using JPA
- Implement a repository
- Implement a service layer
- Create REST controllers
- Handle HTTP requests and responses
- Test CRUD endpoints using Postman

## 🏗️ Architecture

The application follows a layered architecture:

```text
Client
   │
   │ HTTP Request
   ▼
Controller Layer
   │
   ▼
Service Layer
   │
   ▼
Repository Layer
   │
   ▼
H2 Database
