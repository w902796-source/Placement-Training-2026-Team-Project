package EmployeeDepartment;

public class EmployeeOperations {
    Employee[] employees = new Employee[5];
    int count = 0;

    // CREATE
    public void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count] = emp;
            count++;
            System.out.println("Employee Added Successfully");
        } else {
            System.out.println("Array is Full");
        }
    }

    // READ
    public void viewEmployees() {
        if (count == 0) {
            System.out.println("No employees found");
            return;
        }

        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // UPDATE
    public void updateEmployee(long id, String newName) {
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                employees[i].name = newName;
                System.out.println("Employee Updated");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    // DELETE
    public void deleteEmployee(long id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].id == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee Deleted");
                return;
            }
        }
        System.out.println("Employee Not Found");
    }
}