package EmployeeDepartment;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeOperations operations = new EmployeeOperations();

        while (true) {
            System.out.println("\nEMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    long id = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp = new Employee(id, name, dept, salary);
                    operations.addEmployee(emp);
                    break;

                case 2:
                    operations.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    long updateId = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    operations.updateEmployee(updateId, newName);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    long deleteId = sc.nextLong();

                    operations.deleteEmployee(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}