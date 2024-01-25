// Employee class, extends Person
public class Employee extends Person {
    String position;
    double salary;

    // Constructor for creating an Employee with name, surname, position, and salary
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position; 
        this.salary = salary; 
    }

    // Getter method for position
    public String getPosition() {
        return position;
    }

    // Setter method for position
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method to represent Employee's information as a string
    @Override
    public String toString() {
        return "Employee: " + id + " " + name + " " + surname;
    }

    // Implementation of the Payable interface method for Employee
    public double getPaymentAmount() {
        return salary;
    }
}
