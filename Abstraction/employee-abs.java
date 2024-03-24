/*Sure, let's consider a different problem statement where we have different types of employees in a company (such as full-time employees, part-time employees, and consultants). We want to calculate the monthly salary of each type of employee and also be able to display their details.
*/
//combining all classes in one file

// Abstract Employee class
abstract class Employee {
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to calculate monthly salary
    abstract double calculateMonthlySalary();

    // Getters for name and id
    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    // Abstract method to display employee details
    abstract void displayDetails();
}

// FullTimeEmployee class extending Employee
class FullTimeEmployee extends Employee {
    private double salary;

    FullTimeEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    double calculateMonthlySalary() {
        return salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Monthly Salary: $" + calculateMonthlySalary());
    }
}

// PartTimeEmployee class extending Employee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateMonthlySalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: $" + calculateMonthlySalary());
    }
}

// Consultant class extending Employee
class Consultant extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    Consultant(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateMonthlySalary() {
        // Consultants are paid hourly with no benefits
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Consultant Details:");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Monthly Salary: $" + calculateMonthlySalary());
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating objects of different types of employees
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 1001, 5000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Jane Smith", 2001, 20, 80);
        Consultant consultant = new Consultant("Alex Johnson", 3001, 50, 40);

        // Displaying details and calculating monthly salary for each employee
        fullTimeEmployee.displayDetails();
        System.out.println();
        partTimeEmployee.displayDetails();
        System.out.println();
        consultant.displayDetails();
    }
}
