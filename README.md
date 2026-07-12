# 🚀 DevLaunch - AI-Powered Developer Career Hub

DevLaunch is a full-stack web application that helps students and developers manage their career journey from one platform.

This project is being built using Spring Boot for the backend and React for the frontend.

---

## ✨ Current Features

- ✅ User Registration
- ✅ Password Encryption using BCrypt
- ✅ Input Validation
- ✅ Global Exception Handling
- ✅ MySQL Database Integration
- ✅ REST API using Spring Boot

---

## 🚀 Upcoming Features

- User Login
- JWT Authentication
- Resume Builder
- Job Application Tracker
- Coding Progress Tracker
- Study Planner
- AI Mock Interview
- Dashboard
- Profile Management

---

## 🛠 Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Spring Security
- Hibernate
- MySQL
- Maven

### Frontend (Coming Soon)
- React
- TypeScript
- Tailwind CSS

### Tools
- IntelliJ IDEA
- MySQL Workbench
- Postman
- Git
- GitHub

---

## 📂 Project Structure

```
devlaunch
│
├── devlaunch-backend
│   ├── controller
│   ├── service
│   ├── repository
│   ├── entity
│   ├── dto
│   ├── exception
│   ├── config
│   └── security
│
└── devlaunch-frontend (Coming Soon)
```

---

## 📌 Current API

### Register User

**POST**

```
/api/auth/register
```

### Request

```json
{
  "email": "student@gmail.com",
  "password": "Password@123"
}
```

### Success Response

```json
{
  "message": "User Registered Successfully"
}
```

---

## ⚙️ How to Run

1. Clone the repository

```bash
git clone https://github.com/Divyareddy77/Devlaunch.git
```

2. Open the backend project in IntelliJ IDEA.

3. Configure MySQL in:

```
application.properties
```

4. Run:

```
DevlaunchBackendApplication
```

5. Test the API using Postman.

---

## 👩‍💻 Author

**Divya**

GitHub: https://github.com/Divyareddy77


---

⭐ This project is actively being developed. More features will be added regularly.
