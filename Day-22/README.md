# Day 22 – React Student Login and Registration

## UPS Full Stack Training

### Topics Covered
- React Application Setup using Vite
- React Components
- React Router DOM
- `useState` Hook
- Controlled Form Inputs
- Form Handling and Event Handling
- Fetch API
- REST API Integration
- Handling API Responses and Errors

### Technologies Used
- React
- JavaScript
- HTML5
- CSS3
- Vite
- React Router DOM
- Spring Boot

---

## Practical – Student Login and Registration

Developed a React frontend for a Student Login and Registration application integrated with a Spring Boot backend.

### 1. Login Page

- Student email and password inputs.
- Sends login details to the backend.
- Displays login response.
- Displays student details after successful login.
- Navigation to the registration page.

**Source Code:** [Login.jsx](StudentManagement/src/components/Login.jsx)

### 2. Registration Page

- Student name, email, password and phone number inputs.
- Manages form data using React `useState`.
- Sends registration details to the backend.
- Displays registration response.
- Navigation to the login page.

**Source Code:** [Register.jsx](StudentManagement/src/components/Register.jsx)

### 3. React Routing

Implemented navigation between login and registration pages.

- `/` – Login Page
- `/register` – Registration Page

**Source Code:** [App.jsx](StudentManagement/src/App.jsx)

### 4. CSS Styling

Applied CSS styling for forms, buttons, messages and page layouts.

- [App.css](StudentManagement/src/App.css)
- [index.css](StudentManagement/src/index.css)

### 5. Application Configuration

- [main.jsx](StudentManagement/src/main.jsx)
- [index.html](StudentManagement/index.html)
- [package.json](StudentManagement/package.json)
- [vite.config.js](StudentManagement/vite.config.js)
- [eslint.config.js](StudentManagement/eslint.config.js)

---

## Backend API Integration

**Base URL:** `http://localhost:8080/students`

| HTTP Method | Endpoint | Purpose |
|---|---|---|
| POST | `/students/login` | Student Login |
| POST | `/students/register` | Student Registration |

---

## Project Structure

```text
Day-22/
├── StudentManagement/
│   ├── node_modules/
│   ├── public/
│   ├── src/
│   │   ├── assets/
│   │   ├── components/
│   │   │   ├── Login.jsx
│   │   │   └── Register.jsx
│   │   ├── App.css
│   │   ├── App.jsx
│   │   ├── index.css
│   │   └── main.jsx
│   ├── .gitignore
│   ├── eslint.config.js
│   ├── index.html
│   ├── package-lock.json
│   ├── package.json
│   ├── README.md
│   └── vite.config.js
└── README.md
```

---

## How to Run

1. Open the `StudentManagement` folder in VS Code.
2. Open the terminal inside the folder.
3. Install the dependencies:

```bash
npm install
```

4. Start the React application:

```bash
npm run dev
```

5. Open the local URL displayed in the terminal.
6. Start the Spring Boot backend separately to test login and registration.

---

## Key Learnings

- Created React components for login and registration.
- Managed form data using the `useState` Hook.
- Implemented navigation between pages.
- Connected React with Spring Boot REST APIs.
- Used Fetch API to send and receive data.
- Practiced handling API responses and errors.

---

**Day 22 completed – React frontend integration with Spring Boot.**