package P4;
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    void getSalary() {
        System.out.println("Salary is credited");
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is hiring new employees");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the system");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();         
        emp.getSalary();    

        HRManager hr = new HRManager();
        hr.work();          
        hr.getSalary();     
        hr.addEmployee();   
    }
}
