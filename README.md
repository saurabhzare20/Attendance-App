# Attendance-App


# Spring Boot User Authentication System

This is a simple Spring Boot application that provides APIs for user authentication, registration, and session management.

## Features

- **Login**: Users can log in using their email and password.
- **Registration**: New users can register by providing their username, email, password, and phone number.
- **Sign In/Sign Out**: Users can manually sign in and sign out.
- **Load Records**: Users can load their sign-in records.
- **Get All Users**: Admins can retrieve a list of all users registered in the system.
## Configuration

1. **Database Setup**:
   - Create a MySQL database named `user_authentication`.
   - Update the database configuration in `application.properties` file located in `src/main/resources` directory.

2. **Build and Run**:
   - Navigate to the project directory.
   - Run `mvn clean install` to build the project.
   - Run `mvn spring-boot:run` to start the Spring Boot application.

3. **Accessing APIs**:
   - The APIs can be accessed using a tool like Postman or by sending HTTP requests to the specified endpoints.


## Endpoints

- **Login**: `POST /login`
- **Register**: `POST /register`
- **Sign In**: `GET /signin/{username}`
- **Sign Out**: `GET /signout/{username}`
- **Load Records**: `GET /load-records?username={username}`
- **Get All Users**: `GET /all-users`
