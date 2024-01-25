// Abstract class representing a person, implements Payable and Comparable interfaces
public abstract class Person implements Payable, Comparable<Person> {
        // Static variable to automatically set unique IDs
        public static int countId = 1;
        public int id;
    public String name;
    public String surname;
    // Helper method to get the next available ID
    public static int getNextId() {
        return countId++;
    }
        // Constructors
        public Person(String name, String surname) {
            this.id = getNextId();
            this.name = name;
            this.surname = surname;
        }

        // toString method
        @Override
        public String toString() {
            return id + " " + name + " " + surname;
        }

        // Getter for id
        public int getId() {
            return id;
        }

        // Getters and setters for name and surname
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

    // Default implementation for getPosition method (returns "Student")
        public String getPosition() {
            return "Student";
        }
    // Implementation of the Comparable interface for sorting based on payment amount
    public int compareTo(Person person) {
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());

    }
}
