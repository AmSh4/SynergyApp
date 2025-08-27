# Folder Structure

      SynergyApp/
      ├── pom.xml
      ├── README.md
      ├── .gitignore
      ├── Dockerfile
      ├── src/
      │   ├── main/
      │   │   ├── java/
      │   │   │   └── com/
      │   │   │       └── synergy/
      │   │   │           ├── SynergyApplication.java
      │   │   │           ├── config/
      │   │   │           │   └── SecurityConfig.java
      │   │   │           ├── controller/
      │   │   │           │   ├── HomeController.java
      │   │   │           │   └── IntegrationController.java
      │   │   │           ├── model/
      │   │   │           │   └── Integration.java
      │   │   │           ├── repository/
      │   │   │           │   └── IntegrationRepository.java
      │   │   │           └── service/
      │   │   │               ├── ApiService.java
      │   │   │               └── IntegrationService.java
      │   │   └── resources/
      │   │       ├── application.properties
      │   │       ├── static/
      │   │       │   ├── css/
      │   │       │   │   └── style.css
      │   │       │   └── js/
      │   │       │       └── script.js
      │   │       └── templates/
      │   │           ├── index.html
      │   │           ├── login.html
      │   │           ├── integrations.html
      │   │           ├── integration-form.html
      │   │           └── integration-result.html
      │   └── test/
      │       └── java/
      │           └── com/
      │               └── synergy/
      │                   ├── SynergyApplicationTests.java
      │                   └── service/
      │                       └── IntegrationServiceTest.java
