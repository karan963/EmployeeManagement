Overview
The Employee Management System is a web application built using Spring Boot and Thymeleaf. The primary purpose of this application is to allow administrators to manage employee information in a seamless and user-friendly interface. The system provides features such as employee CRUD (Create, Read, Update, Delete) operations, searching employees, and viewing detailed employee records.
This web application is designed with a clean architecture, utilizing Spring Boot for the backend logic and Thymeleaf for rendering dynamic views on the frontend. The system is fully responsive and can be accessed through a web browser.

Features
1. Employee Management:
    •	Add New Employee: Users can add new employees with essential details like name, position, department, email, etc.
    •	Update Employee Information: Employees' details can be edited and updated.
    •	Delete Employee: Administrators can remove employees from the system.
    •	View Employee Details: All employee records are stored in a list format where each record can be clicked to view the full details.
    •	Search Employee: A search bar allows users to quickly find employees based on specific criteria (e.g., name or department).
2. User-friendly Interface:
    • Designed for ease of use with an intuitive layout and simple navigation, making it accessible even to users with minimal technical knowledge.
Technologies Used
    •	Spring Boot: Provides a robust framework for the backend, including security, database interaction, and API management.
    •	Thymeleaf: A server-side Java template engine used to render dynamic web pages on the frontend.
    •	Spring Data JPA: Simplifies the database interaction and mapping entities to tables in a relational database.
    •	MySQL: An open-source relational database management system (RDBMS).
    •	Bootstrap: A front-end framework that provides ready-to-use components for responsive, modern designs.
    •	Maven: Used for project dependency management and build automation.
Prerequisites:
    • Before running the application, ensure you have the following installed:
Java 11 or higher
    •	Maven for building the project
    •	IDE such as IntelliJ IDEA, Eclipse, or VSCode (optional but recommended)
Setup and Installation
1.	Clone the repository: Clone this repository to your local machine using the following.
    •	command: git clone https://github.com/your-username/employee-management.git
2.	Navigate to the project folder:
    •	cd employee-management
3.	Build the project: Use Maven to build the project and resolve dependencies.
    •	mvn clean install
4.	Run the application: You can run the Spring Boot application using the following Maven.
    •	command: mvn spring-boot:run
5.	Access the application: Open your browser and go to:
    •	http://localhost:8080
