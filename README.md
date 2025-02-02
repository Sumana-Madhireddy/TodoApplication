# Todo Application

A simple, user-friendly Todo application built using Spring Boot, Thymeleaf, and JPA for task management. This application allows users to add, delete, and toggle tasks between completed and pending states.

## Features

- **Add New Task**: Users can input a task title and add it to the list.
- **Toggle Task Status**: Tasks can be marked as "Completed" or "Pending".
- **Delete Task**: Users can delete tasks from the list.
- **Responsive UI**: The app is designed to be mobile-friendly and adjust for different screen sizes.

## Technologies Used

- **Spring Boot**: For building the backend services and API.
- **Thymeleaf**: For rendering dynamic HTML templates.
- **JPA (Hibernate)**: For database interaction and entity management.
- **H2 Database**: A lightweight in-memory database used for storing tasks (alternatively, you can configure MySQL/PostgreSQL).

## Prerequisites

Before running the application, make sure you have the following installed:

- **Java 11 or later**: Required to run the Spring Boot application.
- **Maven**: For building the project and handling dependencies.
- **IDE (Optional)**: IntelliJ IDEA, VS Code, or any preferred IDE for Java development.

## Setup and Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/your-username/todo-application.git
cd todo-application
```
## Open the project in your preferred IDE.

Install the required dependencies using Maven:

```bash
mvn clean install
```
Run the application using Maven:
```bash
mvn spring-boot:run
```
Once the application starts, open your browser and go to http://localhost:8080 to view the Todo application.

## Project Structure
```plaintext
todo-application/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── app/
│   │   │   │   │   ├── todoapp/
│   │   │   │   │   │   ├── controllers/
│   │   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── repository/
│   │   │   │   │   │   └── services/
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   ├── templates/
│   │   │   │   └── tasks.html
│   │   │   └── application.properties
├── pom.xml
└── README.md
```


- **controllers/**: Contains the TaskController for managing requests.
- **models/**: Contains the Task entity class representing the database structure.
- **repository/**: Contains the TaskRepository interface for CRUD operations.
- **services/**: Contains the TaskService class for business logic.
- **templates/**: Contains the Thymeleaf templates (e.g., tasks.html).
- **application.properties**: Contains configuration settings.

## Usage
- **Add Task**: Enter a task title in the input field and click the "Add Task" button.
- **Toggle Task Status**: Click the "Complete" button to toggle the task's status between "Completed" and "Pending".
- **Delete Task**: Click the "Delete" button to remove the task from the list.

## Configuration
### Database Configuration (Optional)
By default, the application uses an in-memory H2 database. If you'd like to configure a different database, you can modify the `application.properties` file:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todoapp
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

## Screenshots
Here you can add a screenshot or description of your UI.

## Contributing
- **Fork the repository.

- **Create a new branch (git checkout -b feature-name).

- **Make your changes and commit them (git commit -am 'Add new feature').

- **Push to the branch (git push origin feature-name).

- **Create a new pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
