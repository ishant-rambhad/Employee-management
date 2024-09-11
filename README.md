# Employee Management System

## Overview

The *Employee Management System* is a simple application designed to manage employee records. This project provides the essential CRUD (Create, Read, Update, Delete) operations, implemented using Java technologies such as Swing for the user interface and Hibernate for seamless interaction with the MySQL database.

![{CC1F22DD-572E-4613-93DD-CE9FA2CFB758}](https://github.com/user-attachments/assets/eacc4f8b-6584-4b2b-ac9b-a633fd16367a)

![{FA0C7F98-2DF5-4E33-BC35-05A156E8F0CC}](https://github.com/user-attachments/assets/c69a072b-3a6e-4bca-8c20-17bc0fac3a50)

![{E266908A-3F8E-4A3B-8F9A-38146D0BE3FB}](https://github.com/user-attachments/assets/3ed03ae4-2b33-4ee7-83e3-b23dfe8458e7)

## Features

- *Register/Create Employee*: Allows for adding new employee records to the database.
![{23202BEC-BE5C-483E-AF3A-6DD4BDB4B4A9}](https://github.com/user-attachments/assets/7d03beb6-826e-4d65-9a72-fec6cc95ca0d)
![{036F6606-8B9C-45ED-B42D-C4A7A4656DD0}](https://github.com/user-attachments/assets/a0843048-636e-4286-9ce7-af3ec2d55bd4)

- *Update Employee*: Edit and update the details of existing employee records.
![{A64BE6CE-ADBD-4D3C-B3A6-B1F7A0B700A2}](https://github.com/user-attachments/assets/8ebee1cd-d099-46fe-a6dc-175be3877f73)
![{1ED8AC4F-5C20-406F-A772-451CC9D442FF}](https://github.com/user-attachments/assets/146f255c-58e9-49de-82fb-c0157773e73b)
![{C384678D-864B-4956-A4E5-A0B99448EA24}](https://github.com/user-attachments/assets/1edf3f5e-4ef9-4f04-8b76-d56021edae66)
  
- *View All Employees*: Display all employee records in a clean, user-friendly interface.
![{C69C77BC-A2DD-4889-A497-2EBD81273250}](https://github.com/user-attachments/assets/4851b0c2-7637-478a-b4fb-023de742d5fb)

- *Delete Employee*: Remove employee records from the database.
![{EE107B35-8DCA-443C-9356-D95CD98EB07F}](https://github.com/user-attachments/assets/f4ca1ca4-46d8-4f24-b540-eb282c64670f)
![{01C2D921-B3FF-431B-BB88-16B5F403C6F4}](https://github.com/user-attachments/assets/719bb3de-cd66-41ef-8944-14203a1b8249)
![{E29F8438-4524-4F8E-8CB0-EC1003296942}](https://github.com/user-attachments/assets/d25cf18c-f0e8-483a-a7e2-914e626fec4e)

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
