import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store people
        ArrayList<Person> people = new ArrayList<>();

        // Create instances of Employee and Student
        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Employee employee3 = new Employee("Sergey", "Nechaev", "Engineer ", 13000.00);
        Student student1 = new Student("Kuanysh", "Aitzhanov", 3.47);
        Student student2 = new Student("Paul", "McCartney", 3.12);
        Student student3 = new Student("Ringo", "Starr", 2.23);

        // Add instances to the ArrayList
        people.add(employee1);
        people.add(employee2);
        people.add(employee3);
        people.add(student1);
        people.add(student2);
        people.add(student3);

        // Sort the ArrayList based on the Comparable interface (getPaymentAmount)
        Collections.sort(people);

        // Print the data for each person
        printData(people);
    }

    // Method to print data for each person in the Iterable collection
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            // Check if the person is an instance of Employee
            if (person instanceof Employee) {
                System.out.print(person + " " + "earns" + " " + ((Employee) person).getSalary());
                // Check if the person is an instance of Student
            } else if (person instanceof Student) {
                System.out.print(person + " " + "earns" + " " + (person).getPaymentAmount());
            }

            System.out.println();
        }
    }
}
