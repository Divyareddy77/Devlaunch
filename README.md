# 🚀 DevLaunch Backend

A Spring Boot backend for **DevLaunch**, a job portal application. It provides secure user authentication, role-based authorization, and profile management using JWT and Spring Security.

---

## ✨ Features

- ✅ User Registration
- ✅ User Login
- ✅ Password Encryption (BCrypt)
- ✅ JWT Authentication
- ✅ Role-Based Authorization (USER & ADMIN)
- ✅ User Profile Management
- ✅ Protected REST APIs
- ✅ Global Exception Handling
- ✅ Input Validation

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- JWT
- Maven
- Postman

---

## 📡 API Endpoints

### Authentication
- `POST /api/auth/register`
- `POST /api/auth/login`

### Profile
- `GET /api/profile`
- `PUT /api/profile`

### Admin
- `GET /api/admin/dashboard`

---

## 🔐 Security

- JWT-based Authentication
- BCrypt Password Encryption
- Stateless Session Management
- Custom UserDetails & UserDetailsService
- Role-Based Access Control

---

## ▶️ How to Run

1. Clone the repository

```bash
git clone https://github.com/Divyareddy77/Devlaunch.git
```

2. Configure MySQL in `application.properties`

3. Run the application

```bash
mvn spring-boot:run
```

Server starts at:

```
http://localhost:8080
```

---

## 🚀 Upcoming Features

- Job Management
- Job Applications
- Resume Upload
- Refresh Tokens
- Email Verification
- Swagger Documentation

---

## 👩‍💻 Author

**Divya Reddy**

GitHub: https://github.com/Divyareddy77