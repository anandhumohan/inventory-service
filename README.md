# Inventory Service

## Overview

Inventory Service is a RESTful API developed with Spring Boot, designed to manage inventory data for products. It provides capabilities to add, update, delete, and retrieve product inventory information efficiently.

## Features

- **CRUD Operations:** Create, Read, Update, and Delete inventory items.
- **Search Functionality:** Filter inventory items based on various criteria.
- **Real-time Updates:** WebSocket integration for real-time inventory updates.
- **Security:** Basic Auth/JWT-based authentication to secure API endpoints.

## Prerequisites

Before you begin, ensure you have met the following requirements:
- Java JDK 11 or later
- Maven 3.6 or later
- MySQL 8.0 or later (or any other relational database)

## Setting Up

### Database Configuration

1. Create a new database in your SQL server.
2. Update the `application.properties` file with your database connection details:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=<your_username>
spring.datasource.password=<your_password>
```

### Building the Application

To build the application, navigate to the root directory of the project and run:

```bash
mvn clean install
```

### Running the Application

After building the project, you can run it using:

```bash
java -jar target/inventory-service-0.0.1-SNAPSHOT.jar
```

Or, using Maven:

```bash
mvn spring-boot:run
```

## API Documentation

After starting the application, you can access the Swagger UI to test the API endpoints at:

```
http://localhost:8080/swagger-ui.html
```

## Usage Examples

### Adding a New Inventory Item

```bash
curl -X POST http://localhost:8080/api/inventory -H 'Content-Type: application/json' -d '{
    "productName": "New Product",
    "quantity": 100,
    "price": 9.99
}'
```

### Getting All Inventory Items

```bash
curl http://localhost:8080/api/inventory
```

## Contributing

Contributions are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](LICENSE.md)
