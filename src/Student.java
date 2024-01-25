// Student class, extends Person
public class Student extends Person {
    private double gpa; // GPA field

    // Constructor for creating a Student with name, surname, and GPA
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    // Getter method for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter method for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString method to represent Student's information as a string
    @Override
    public String toString() {
        return "Student: " + id + " " + name + " " + surname;
    }

    // Implementation of the Payable interface method for Student
    public double getPaymentAmount() {
        // If GPA is greater than 2.67, return 36,660, otherwise return 0
        return (getGpa() > 2.67) ? 36660 : 0;
    }
}
