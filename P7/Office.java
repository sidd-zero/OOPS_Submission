package P7;
class Person {
    String firstName = "Siddharth";
    String lastName = "Dwivedi";

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String jobTitle = "Software Developer";
    String employeeId = "1234";

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    String getEmployeeId() {
        return employeeId;
    }
}

public class Office {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
