# Money Manager
A full-stack personal finance application built with React (frontend) and Spring Boot (backend) to help users track and manage their income, expenses, and categories seamlessly.

# 🚀 Features
- User Authentication & Authorization
  - Secure registration and login with JWT
  - Email activation link for account verification
- Income & Expense Management
  - Add, view, edit, and delete income and expense entries
  - Excel export and email reports for daily summaries
- Category Management
  - Create, update, and delete custom categories for incomes and expenses
- Dashboard & Analytics
  - Overview charts showing trends over time
  - Filter transactions by date range, type, keyword, and sort order
- Notifications & Reminders
  - Daily email reminders to log transactions
  - Automated daily expense summaries

# 📦 Tech Stack
## Frontend
- React 18
- Vite
- Tailwind CSS
- React Router DOM
- Axios
- Recharts
- React Hot Toast

## Backend
- Spring Boot 3.5.3
- Spring Security
- Spring Data JPA
- MySQL / PostgreSQL
- JWT (JJWT)
- Apache POI (Excel export)
- Spring Mail (Brevo SMTP)
- Lombok

# 🏗️ Project Structure
``` Money-Manager/ 
├── moneymanager/                 # Spring Boot backend
│   ├── src/main/java/in/devanshu/moneymanager/
│   │   ├── config/               # Security & application configuration
│   │   ├── controller/           # REST controllers
│   │   ├── dto/                  # Data Transfer Objects
│   │   ├── entity/               # JPA entities
│   │   ├── repository/           # Spring Data repositories
│   │   ├── security/             # JWT & security filters
│   │   ├── service/              # Business logic & scheduling
│   │   └── util/                 # Utility classes
│   └── src/main/resources/
│       ├── application.properties
│       └── application-prod.properties
└── moneymanagerwebapp/           # React frontend
    ├── src/
    │   ├── components/           # Reusable UI components
    │   ├── pages/                # Route pages
    │   ├── hooks/                # Custom React hooks
    │   ├── context/              # Global state with Context API
    │   └── util/                 # API & helper utilities
    └── package.json
```

# ⚙️ Getting Started
## Prerequisites
- Node.js ≥ 18
- NPM ≥ 9 or Yarn
- Java ≥ 21
- Maven ≥ 3.6
- MySQL 8.0+ or PostgreSQL 15+

## Local Setup
- Clone the repository
```
git clone https://github.com/DEVANSHUMARKAM/Money-Manager.git
cd Money-Manager
```
## Backend Configuration
- Create .env file under moneymanager/:
```
# Database (MySQL or PostgreSQL)
DATABASE_URL=jdbc:mysql://localhost:3306/moneymanager
DATABASE_USERNAME=root
DATABASE_PASSWORD=YourDBPassword

# JWT
JWT_SECRET=YourSecureJwtSecret

# Email (Brevo SMTP)
SPRING_MAIL_HOST=smtp-relay.brevo.com
SPRING_MAIL_PORT=587
SPRING_MAIL_USERNAME=your-brevo-username
SPRING_MAIL_PASSWORD=YourBrevoPassword

# Frontend & Activation URLs
MONEY_MANAGER_FRONTEND_URL=http://localhost:5173
APP_ACTIVATION_URL=http://localhost:8080

# Active Profile
SPRING_PROFILES_ACTIVE=dev
```
```
docker-compose up -d
```
## Frontend Configuration
```
cd ../moneymanagerwebapp
npm install
npm run dev
```

## Access the application

- Frontend: http://localhost:5173
- Backend API: http://localhost:8080/api/v1.0

## 📖 API Documentation
### Authentication
- POST /api/v1.0/register – Register new user
- POST /api/v1.0/login – Login and obtain JWT
- GET /api/v1.0/activate?token={token} – Activate account
### Income
- GET /api/v1.0/incomes – List all incomes
- POST /api/v1.0/incomes – Add new income
- DELETE /api/v1.0/incomes/{id} – Delete income
- GET /api/v1.0/incomes/download – Download incomes as Excel
- GET /api/v1.0/incomes/email – Email income report
### Expense
- GET /api/v1.0/expenses
- POST /api/v1.0/expenses
- DELETE /api/v1.0/expenses/{id}
- GET /api/v1.0/expenses/download
- GET /api/v1.0/expenses/email
### Categories
- GET /api/v1.0/categories
- POST /api/v1.0/categories
- PUT /api/v1.0/categories/{id}
### 🤝 Contributing
- Fork the repository
- Create a new branch: git checkout -b feature/your-feature
- Commit your changes: git commit -m "Add your feature"
- Push to your branch: git push origin feature/your-feature
- Open a Pull Request

## 📝 License
- This project is licensed under the MIT License. See LICENSE for details.

## ✉️ Contact
Devanshu Markam
Email: devanshuasm750@gmail.com
GitHub: DEVANSHUMARKAM
