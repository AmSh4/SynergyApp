# SynergyApp

A full-stack web application built with Spring Boot for managing API integrations across multiple platforms. This project was developed as a personal exploration of enterprise web development, focusing on seamless data flow between systems to automate routine business tasks.

## Description

SynergyApp enables users to configure, manage, and execute integrations with external APIs, fetching and displaying data in a dashboard. It's designed for scenarios like aggregating data from various cloud services to support decision-making, with a focus on clean architecture and scalability.

## Features

- Secure user authentication
- CRUD operations for integration setups
- Dynamic API fetching and result visualization
- Responsive and intuitive UI/UX
- Automated process execution (e.g., run integrations on demand)
- Comprehensive testing suite
- Docker support for easy deployment

## Technologies Used

- Java 17
- Spring Boot 3
- Spring Data JPA with H2 Database
- Spring Security
- Thymeleaf for server-side rendering
- Bootstrap 5 for UI
- RESTful APIs with RestTemplate
- Maven for build management
- Docker for containerization

## Project Structure
 

## Setup and Running

### Prerequisites
- Java 17
- Maven 3.8+

### Steps
1. Clone or download the project.
2. Open the project directory in your IDE (e.g., IntelliJ) or terminal.
3. Build the project: `mvn clean install`
4. Run the application: `mvn spring-boot:run`
5. Open http://localhost:8080 in your browser.
6. Login with credentials: username `user`, password `password`.
7. Navigate to /integrations to manage and run API integrations (example URLs: https://jsonplaceholder.typicode.com/todos, https://reqres.in/api/users).

### Docker Deployment
1. Build the image: `docker build -t synergy-app .`
2. Run the container: `docker run -p 8080:8080 synergy-app`
3. Access at http://localhost:8080.

## Testing
Run tests with `mvn test`. Includes context loading and service unit tests.

## Notes
- For production, configure a persistent database (e.g., PostgreSQL) and add API keys if using authenticated services.
- The app emphasizes modular code for easy maintenance and extension, such as adding more platform integrations.
- H2 console available at http://localhost:8080/h2-console (use JDBC URL: jdbc:h2:mem:testdb).

Contributions or forks welcome!                


