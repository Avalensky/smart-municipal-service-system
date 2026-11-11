# 🏛️ Smart Municipal Service System

A full-stack **Municipal Service Request Management System** designed to digitize citizen service delivery (water leaks, electricity outages, road maintenance, and waste collection). Built using a layered **Model-View-Controller (MVC)** architecture, the application exposes both a **RESTful JSON API** and an interactive **JSP/Servlet web portal** backed by **MySQL** persistence.

---

## 🚀 Key Features

* **RESTful API Integration:** Exposes structured `GET` and `POST` endpoints (`/api/requests`) for seamless JSON data exchange with external clients and frontend consumers.
* **Citizen Web Portal:** Interactive HTML/JSP submission form (`index.jsp`) connected to Jakarta `@WebServlet` controllers and dynamic database-driven reporting tables (`viewRequest.jsp`).
* **Layered Enterprise Architecture:** Clean separation of concerns across **Model**, **Repository**, **Service**, **Servlet**, and **REST Controller** layers to ensure maintainability and testability.
* **Relational Data Persistence:** Hybrid persistence combining **Spring Data JPA / Hibernate ORM** for automated schema management and **JDBC (`PreparedStatement`)** for direct SQL operations.
* **Decoupled Notification Service:** Interface-driven service design (`NotificationService` / `EmailNotificationService`) enabling extensible alert mechanisms.

---

## 🛠️ Tech Stack

* **Language:** Java 21
* **Framework:** Spring Boot 3.5.5 (Spring Web, Spring Data JPA)
* **Web Tier:** Jakarta Servlets, JSP, JSTL, Embedded Apache Tomcat 10
* **Database:** MySQL Server 8.0, Hibernate ORM, HikariCP Connection Pooling
* **Build & Testing Tools:** Apache Maven, Postman, MySQL Workbench, NetBeans IDE

---

## 🏗️ Project Architecture

```text
src/main/
├── java/
│   ├── com/municipality/smartmunicipalservicesystem/
│   │   └── SmartMunicipalServiceSystem.java   # Application entry point & component scanning
│   ├── controller/
│   │   └── ServiceRequestRestController.java  # REST API endpoints (/api/requests)
│   ├── servlet/
│   │   └── ServiceRequestServlet.java         # Form processing & JSP redirection (/submitRequest)
│   ├── service/
│   │   ├── ServiceRequestService.java         # Business logic & transaction coordination
│   │   ├── NotificationService.java           # Notification contract (Interface)
│   │   └── EmailNotificationService.java      # Concrete notification implementation
│   ├── repository/
│   │   └── ServiceRequestRepository.java      # Spring Data JPA CRUD interface
│   ├── model/
│   │   └── ServiceRequest.java                # JPA Entity & domain models
│   └── util/
│       └── DBConnection.java                  # JDBC connection factory
└── webapp/
    ├── index.jsp                              # Citizen service request submission form
    └── viewRequest.jsp                        # Live database request dashboard
```

---

## 🔌 API Endpoints

| HTTP Method | Endpoint | Description | Request / Response Format |
| :--- | :--- | :--- | :--- |
| **`POST`** | `/api/requests` | Log a new municipal service request | JSON Body -> JSON Object (`200 OK`) |
| **`GET`** | `/api/requests` | Retrieve all logged service requests | JSON Array (`200 OK`) |
| **`POST`** | `/submitRequest` | Process web form submission via Servlet | Form Data -> Redirect to `viewRequest.jsp` |

### Sample `POST` Payload (`/api/requests`)

```json
{
  "citizenName": "Thabo Mokoena",
  "requestType": "Water Leak",
  "description": "Burst water main on Main Road",
  "status": "OPEN"
}
```

---

## ⚙️ Local Setup & Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com
   cd Smart-Municipal-Service-System
   ```
2. **Configure MySQL Database:**
   * Create a database in MySQL Workbench (e.g., `CREATE DATABASE smart_municipal_db;`).
   * Update `src/main/resources/application.properties` with your local credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/smart_municipal_db
     spring.datasource.username=root
     spring.datasource.password=YOUR_PASSWORD
     spring.jpa.hibernate.ddl-auto=update
     ```
3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```
4. **Access the application:**
   * **Web Form:** `http://localhost:8080/index.jsp`
   * **Requests Dashboard:** `http://localhost:8080/viewRequest.jsp`
   * **REST API:** `http://localhost:8080/api/requests`

---

## 📸 Application Preview

*(Tip: Upload your clean screenshots to a `screenshots/` folder in GitHub and link them here!)*
* **Citizen Request Portal & Live Dashboard (`index.jsp` & `viewRequest.jsp`)**
* **Postman REST API Validation (`200 OK` JSON Response)**
* **MySQL Workbench Persistence Verification**


Developer: Ashwin Valensky
