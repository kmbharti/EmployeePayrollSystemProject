package in.sp.project;

import java.util.ArrayList;

abstract class Employee {
    private String name; // Error: Variable name misspelled
    private int id;

    public Employee(String name, int id) {
        this.name = name; // Error: Assigning to a misspelled variable
        this.id = id;
    }

    public String getNam() { // Error: Method name misspelled
        return name; // Error: Returning the correct variable, but the variable itself is misspelled
    }

    public int getID() { // Error: Method name incorrect capitalization
        return id;
    }

    public abstract double calcSalary(); // Error: Method name changed

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + ", salary=" + calcSalary() + "]"; // Error: Using the wrong method name
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthSalary) { // Error: Parameter name changed
        super(name, id);
        this.monthlySalary = monthSalary; // Error: Using the incorrect parameter name
    }

    @Override
    public double calcSalary() { // Error: Using the wrong method name
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorkd; // Error: Variable name misspelled
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorkd = hoursWorked; // Error: Assigning to a misspelled variable
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcSalary() { // Error: Using the wrong method name
        return hoursWorkd * hourlyRate; // Error: Using a misspelled variable
    }
}

class PayrollSystem {
    private ArrayList<Employee> empList; // Error: Variable name changed

    public PayrollSystem() {
        empList = new ArrayList<>(); // Error: Using the incorrect variable name
    }

    public void addEmp(Employee employee) { // Error: Method name changed
        empList.add(employee); // Error: Using the incorrect variable name
    }

    public void removeEmp(int ID) { // Error: Method name and parameter name changed
        Employee empToRemove = null; // Error: Variable name changed
        for (Employee employee : empList) { // Error: Using the incorrect variable name
            if (employee.getID() == ID) { // Error: Using the incorrect parameter name
                empToRemove = employee;
                break;
            }
        }

        if (empToRemove != null) { // Error: Using the incorrect variable name
            empList.remove(empToRemove); // Error: Using the incorrect variable name
        }
    }

    public void showEmployees() { // Error: Method name changed
        for (Employee employee : empList) { // Error: Using the incorrect variable name
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem ps = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Bharti", 1, 700000.0);
        FullTimeEmployee emp2 = new FullTimeEmployee("Aarti", 2, 800000.0);

        ps.addEmp(emp1); // Error: Using the incorrect method name
        ps.addEmp(emp2); // Error: Using the incorrect method name
        System.out.println("Inirial Employee Details:");
        ps.showEmployees(); // Error: Using the incorrect method name
        System.out.println("Removing employee");
        ps.removeEmp(2); // Error: Using named parameters which is not supported in Java
        System.out.println("Remaing employee Details:");
        ps.showEmployees(); // Error: Using the incorrect method name
    }
}
