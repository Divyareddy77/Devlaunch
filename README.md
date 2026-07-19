# 🚀 DevLaunch Backend

DevLaunch is a **Developer Career Hub** backend built with **Spring Boot**. It provides secure REST APIs for user authentication and resume management using JWT.

## ✨ Features

- 🔐 User Registration & Login
- 🔑 JWT Authentication & Authorization
- 🔒 BCrypt Password Encryption
- 📄 Resume CRUD Operations
- ✅ Request Validation
- ⚠️ Global Exception Handling
- 🗄️ MySQL Database Integration

## 🛠️ Tech Stack

- Java 23
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- JWT
- Lombok
- Maven

## 📌 REST APIs

### Authentication
- `POST /api/auth/register`
- `POST /api/auth/login`

### Resume
- `POST /api/resumes`
- `GET /api/resumes`
- `GET /api/resumes/{id}`
- `PUT /api/resumes/{id}`
- `DELETE /api/resumes/{id}`

## ▶️ Run the Project

1. Clone the repository
2. Configure MySQL in `application.properties`
3. Run the application
4. Test APIs using Postman

## 🚧 Upcoming Features

- Education Management
- Skills Management
- Project Management
- Experience Management
- Certification Management
- AI Resume Review

## 👩‍💻 Author

**Divya Vanga**