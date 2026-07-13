# 🚀 DevLaunch - AI-Powered Developer Career Hub

DevLaunch is a full-stack web application designed to help students manage their placement journey from a single platform. It provides features like user authentication, resume management, job applications, study planning, coding progress tracking, and placement preparation.

## ✨ Features

### ✅ Authentication
- User Registration
- User Login
- BCrypt Password Encryption
- JWT (JSON Web Token) Authentication
- Protected APIs using Spring Security
- Global Exception Handling

### 🚧 Upcoming Features
- Role-Based Authorization (Admin/User)
- Resume Builder
- Job Application Tracker
- Study Planner
- Coding Progress Tracker
- Dashboard
- AI Mock Interview

---

## 🛠 Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- JWT (JJWT)
- Maven

### Tools
- IntelliJ IDEA
- MySQL Workbench
- Postman
- Git & GitHub

---

## 📂 Project Structure

```
devlaunch-backend
│
├── config
├── controller
├── dto
│   ├── request
│   └── response
├── entity
├── exception
├── repository
├── security
├── service
└── resources
```

---

## 🔐 API Endpoints

### Authentication

### Register User

```
POST /api/auth/register
```

Request

```json
{
    "email": "student@gmail.com",
    "password": "Password@123"
}
```

---

### Login

```
POST /api/auth/login
```

Request

```json
{
    "email": "student@gmail.com",
    "password": "Password@123"
}
```

Response

```json
{
    "token": "JWT_TOKEN"
}
```

---

### Protected API

```
GET /api/profile
```

Header

```
Authorization: Bearer <JWT_TOKEN>
```

Response

```
Welcome Divya!
```

---

## 🔒 JWT Authentication Flow

1. User registers with email and password.
2. Password is encrypted using BCrypt.
3. User logs in with valid credentials.
4. Backend generates a JWT.
5. Frontend stores the JWT.
6. JWT is sent in the Authorization header.
7. JwtAuthenticationFilter validates the token.
8. SecurityContextHolder authenticates the request.
9. Protected APIs become accessible.

---

## ⚙️ How to Run the Project

### Clone Repository

```bash
git clone https://github.com/Divyareddy77/Devlaunch.git
```

### Navigate to Backend

```bash
cd Devlaunch/devlaunch-backend
```

### Configure MySQL

Create a database

```
devlaunch_db
```

Update

```
application.properties
```

with your MySQL username and password.

### Run the Application

Run

```
DevlaunchBackendApplication.java
```

or

```bash
mvn spring-boot:run
```

---

## 📸 Screenshots

- User Registration
- User Login
- JWT Token Generation
- Protected API (200 OK)
- Unauthorized Access (401/403)


---

## 👩‍💻 Author

**Vanga Divya Reddy**

GitHub:
https://github.com/Divyareddy77

---

## 📌 Current Status

✅ User Registration

✅ User Login

✅ BCrypt Password Encryption

✅ JWT Authentication

✅ Protected APIs

🚧 Role-Based Authorization (Coming Soon)

🚧 Resume Builder

🚧 Job Tracker

🚧 AI Features