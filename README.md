# Employee Management System

## Overview

The *Employee Management System* is a simple application designed to manage employee records. This project provides the essential CRUD (Create, Read, Update, Delete) operations, implemented using Java technologies such as Swing for the user interface and Hibernate for seamless interaction with the MySQL database.

## Features

- *Register/Create Employee*: Allows for adding new employee records to the database.
- *Update Employee*: Edit and update the details of existing employee records.
- *View All Employees*: Display all employee records in a clean, user-friendly interface.
- *Delete Employee*: Remove employee records from the database.

## Technologies Used

- *Java Swing*: Used for creating a clean and responsive user interface.
- *Java Hibernate*: Facilitates communication between the Java application and the MySQL database.
- *MySQL*: The database system used to store employee data.
- *Maven*: Used for dependency management.

## Setup and Installation

### Prerequisites

- Java Development Kit (JDK) 8 or later
- MySQL Server
- Maven
- IDE (Eclipse/IntelliJ IDEA preferred)

### Steps to Set Up

1. *Clone the repository:*

   bash
   git clone https://github.com/yourusername/employee-management-system.git
   cd employee-management-system
   

2. *Create a MySQL Database:*

   Create a database in MySQL for the project:

   sql
   CREATE DATABASE employee_management;
   

3. *Update Database Configuration:*

   Modify the hibernate.cfg.xml file in the project to match your MySQL database configuration (username, password, and database URL).

4. *Build the project:*

   Use Maven to build the project:

   bash
   mvn clean install
   

5. *Run the project:*

   Execute the application from your IDE or using the Maven command:

   bash
   mvn exec:java
   

## Usage

Once the project is running, the main window of the Employee Management System will open, where you can perform the following actions:

- *Register/Create*: Enter employee details and add a new employee to the database.
- *Update*: Modify the information of an existing employee by selecting them and editing their details.
- *View All*: List all employees and their respective details.
- *Delete*: Select an employee to remove their data from the database.

## Contributing

Feel free to contribute to this project by submitting pull requests or suggesting features and improvements. Please ensure to follow the contribution guidelines outlined below:

- Fork the repository.
- Create a new branch for your feature or bug fix.
- Commit your changes and open a pull request.  
