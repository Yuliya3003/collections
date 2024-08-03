package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeDirectory directory = new EmployeeDirectory();


        directory.addToDirectory(new Employee("001", "123-456-7890", "Alice", 5));
        directory.addToDirectory(new Employee("002", "234-567-8901", "Bob", 3));
        directory.addToDirectory(new Employee("003", "345-678-9012", "Alice", 2));
        directory.addToDirectory(new Employee("004", "456-789-0123", "Charlie", 5));


        List<Employee> experiencedEmployees = directory.findByExperience(5);
        System.out.println("Employees with 5 years of experience: " + experiencedEmployees);


        List<String> phoneNumbers = directory.findNumberByName("Alice");
        System.out.println("Phone numbers for Alice: " + phoneNumbers);


        Employee employee = directory.findEmployeeByPersonnelNumber("002");
        System.out.println("Employee with personnel number 002: " + employee);


        directory.addToDirectory(new Employee("002", "567-890-1234", "Duplicate", 4));
    }
}