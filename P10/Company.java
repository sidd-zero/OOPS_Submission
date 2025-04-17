package P10;
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    double calculateBonus() {
        return 0;
    }

    void generatePerformanceReport() {
        System.out.println(jobTitle + " Performance Report for " + name);
    }

    void manageProjects() {
        System.out.println(jobTitle + " " + name + " manages general tasks.");
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Address: " + address + ", Salary: " + salary + ", Job Title: " + jobTitle);
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    double calculateBonus() {
        return salary * 0.20;
    }

    void manageProjects() {
        System.out.println(name + " is managing multiple high-level projects and teams.");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    double calculateBonus() {
        return salary * 0.15;
    }

    void manageProjects() {
        System.out.println(name + " is working on software development projects.");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    double calculateBonus() {
        return salary * 0.10;
    }
    void manageProjects() {
        System.out.println(name + " is coding modules and maintaining applications.");
    }
}

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Siddharth", "Delhi", 100000);
        Developer d = new Developer("Sujal", "Mumbai", 80000);
        Programmer p = new Programmer("Nirbhay", "Bangalore", 60000);

        m.displayDetails();
        m.generatePerformanceReport();
        m.manageProjects();
        System.out.println("Bonus: " + m.calculateBonus() + "\n");

        d.displayDetails();
        d.generatePerformanceReport();
        d.manageProjects();
        System.out.println("Bonus: " + d.calculateBonus() + "\n");

        p.displayDetails();
        p.generatePerformanceReport();
        p.manageProjects();
        System.out.println("Bonus: " + p.calculateBonus());
    }
}
