# Employee Management Program

This Java program allows users to manage a list of employees, providing functionalities to add new employees with unique IDs, update employee salaries by a specified percentage, and display the updated list of employees.
This documentation provides an overview of the program's functionality, usage instructions and a brief description of the code structure.

## Features

- **Adding Employees**: Users can input details for multiple employees, including their name, ID (must be unique), and initial salary.
  
- **Updating Salary**: Users can select an employee by their ID and specify a percentage increase in salary.
  
- **Displaying Employee List**: At the end of the program, the updated list of employees (including their IDs, names, and salaries) is displayed.

- **Unique ID Validation**: Ensures that each employee ID entered is unique and prompts the user to enter a different ID if a duplicate is found.

- **Employee ID Validation for Salary Update**: Checks if the entered employee ID exists when updating the salary. If the ID is not found, an appropriate message is displayed.

## How to Use

1. **Run the Program**: Execute the program in a Java IDE or command line.

2. **Input Employee Details**:
   - Enter the number of employees to be registered.
   - For each employee, input their name, ID (must be unique and validated), and initial salary.

3. **Update Employee Salary**:
   - Choose an employee by their ID.
   - Enter the percentage increase in salary.

4. **View Updated Employee List**:
   - After updating the salary, the program displays the updated list of all employees, showing their IDs, names, and new salaries.


## Requirements

- Java Development Kit (JDK) installed.
- Java IDE or command line interface.

**Follow the prompts** on the console to interact with the program.

## Notes

- Ensure that each employee ID is unique to avoid conflicts during the addition and updating of employee records.
- The program demonstrates basic object-oriented programming concepts in Java, including class design, encapsulation, and method overriding.

## Code Overview

### Main Class

The `Main` class contains the main method and handles the user interaction, such as inputting employee details and updating salaries.

### Validation Class

The Validation class contains utility methods to check for unique IDs and to search for employees by ID.

### Funcionario Class

The Funcionario class represents an employee and includes methods for salary adjustments and formatted output.

