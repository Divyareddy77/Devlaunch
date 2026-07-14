# 🚀 DevLaunch Backend

A secure and scalable backend application built with **Spring Boot** for the DevLaunch platform. The project implements **JWT-based authentication**, **Spring Security**, and **Role-Based Authorization** to provide secure access to REST APIs.

---

# 📌 Project Overview

DevLaunch Backend is designed to provide secure user authentication and authorization using modern Spring Boot best practices. It enables users to register, log in, and access protected resources based on their roles (USER or ADMIN).

The application follows a layered architecture and uses Spring Security with JWT for stateless authentication.

---

# ✨ Features

### Authentication & Security
- ✅ User Registration
- ✅ User Login
- ✅ Password Encryption using BCrypt
- ✅ JWT Token Generation
- ✅ JWT Token Validation
- ✅ Stateless Authentication
- ✅ Spring Security Integration
- ✅ Custom JWT Authentication Filter

### Authorization
- ✅ Role-Based Authorization (USER & ADMIN)
- ✅ Protected REST APIs
- ✅ Custom UserDetails
- ✅ Custom UserDetailsService
- ✅ SecurityContextHolder Authentication

### Backend
- ✅ RESTful API Design
- ✅ Spring Data JPA
- ✅ MySQL Database Integration
- ✅ Global Exception Handling
- ✅ Clean Layered Architecture

---

# 🛠️ Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming Language |
| Spring Boot | Backend Framework |
| Spring Security | Authentication & Authorization |
| Spring Data JPA | Database Access |
| MySQL | Database |
| JWT | Stateless Authentication |
| BCrypt | Password Hashing |
| Maven | Dependency Management |

---

# 🔐 Authentication Flow

```text
User Login
     │
     ▼
Email & Password Verification
     │
     ▼
BCrypt Password Validation
     │
     ▼
Generate JWT Token
     │
     ▼
Client Stores JWT
     │
     ▼
Authorization: Bearer <JWT>
     │
     ▼
JwtAuthenticationFilter
     │
     ▼
Validate JWT
     │
     ▼
Extract Email
     │
     ▼
CustomUserDetailsService
     │
     ▼
Load User Details
     │
     ▼
Create Authentication Object
     │
     ▼
SecurityContextHolder
     │
     ▼
Spring Security Authorization
     │
     ▼
Protected Controller
```

---

# 🔑 Role-Based Authorization

| Role | Access |
|------|--------|
| USER | User APIs |
| ADMIN | User APIs + Admin APIs |

Example:

- `/api/auth/**` → Public
- `/api/user/**` → USER & ADMIN
- `/api/admin/**` → ADMIN Only

---

# 📡 REST API Endpoints

## Authentication APIs

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and receive JWT |

## Protected APIs

| Method | Endpoint | Access |
|---------|----------|--------|
| GET | `/api/user/profile` | USER / ADMIN |
| GET | `/api/admin/dashboard` | ADMIN |

---

# 📂 Project Structure

```text
src
└── main
    ├── java
    │   └── com.devlaunch
    │       ├── config
    │       ├── controller
    │       ├── dto
    │       ├── entity
    │       ├── exception
    │       ├── repository
    │       ├── security
    │       └── service
    └── resources
        └── application.properties
```

---

# ▶️ How to Run the Project

### Clone the Repository

```bash
git clone https://github.com/Divyareddy77/Devlaunch.git
```

### Navigate to the Project

```bash
cd Devlaunch
```

### Configure MySQL

Update `application.properties`

```properties
spring.datasource.url=YOUR_DATABASE_URL
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

jwt.secret=YOUR_SECRET_KEY
jwt.expiration=86400000
```

### Run the Application

```bash
mvn spring-boot:run
```

Server starts on:

```
http://localhost:8080
```

---

# 🧪 Testing the APIs

You can test the APIs using **Postman** or **Thunder Client**.

### Register

```
POST /api/auth/register
```

### Login

```
POST /api/auth/login
```

Response

```json
{
  "token": "your_jwt_token"
}
```

Use the token for protected APIs.

```
Authorization: Bearer <your_jwt_token>
```

---

# 📈 Current Project Progress

## ✅ Completed

- User Registration
- User Login
- BCrypt Password Encryption
- JWT Authentication
- JWT Validation
- Spring Security Integration
- Custom JWT Authentication Filter
- Role-Based Authorization
- Custom UserDetails
- Custom UserDetailsService
- Protected APIs
- Global Exception Handling

## 🚧 Next Features

- Job Management Module
- Resume Management Module
- AI Resume Review
- Refresh Token Authentication
- Email Verification
- Forgot Password
- Swagger/OpenAPI Documentation
- Docker Deployment
- AWS Deployment
- Unit & Integration Testing
- CI/CD Pipeline

---

# 🎯 Learning Outcomes

This project demonstrates practical knowledge of:

- Spring Boot
- Spring Security
- JWT Authentication
- BCrypt Password Encoding
- REST API Development
- Authentication vs Authorization
- Role-Based Access Control (RBAC)
- UserDetails & UserDetailsService
- Exception Handling
- Layered Architecture

---

# 👩‍💻 Author

**Divya Vanga**

- GitHub: https://github.com/Divyareddy77/Devlaunch
- LinkedIn: https://www.linkedin.com/in/divya-vanga-62249a333

---

⭐ If you found this project useful, consider giving it a **Star** on GitHub!