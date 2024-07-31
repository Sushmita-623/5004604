package com.example.employees;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee e1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee e2 = new Employee("E002", "Bob", "Developer", 60000);
        Employee e3 = new Employee("E003", "Charlie", "Analyst", 50000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("Employees after adding:");
        ems.traverseEmployees();

        Employee searched = ems.searchEmployee("E002");
        if (searched != null) {
            System.out.println("Searched Employee: " + searched);
        } else {
            System.out.println("Employee not found.");
        }

        ems.deleteEmployee("E002");
        System.out.println("Employees after deletion:");
        ems.traverseEmployees();
    }
}
