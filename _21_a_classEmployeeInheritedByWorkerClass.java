class Employee {
    int employee_no;
    String name, address;

    Employee(int employee_no, String name, String address) {
        this.employee_no = employee_no;
        this.name = name;
        this.address = address;
    }
}

class Worker extends Employee {
    int no_of_hours;

    Worker(int employee_no, String name, String address, int no_of_hours) {
        super(employee_no, name, address);
        this.no_of_hours = no_of_hours;
    }

    void display_details() {
        System.out.println("Worker details:");
        System.out.println("Employee no.: " + employee_no);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("No. of hours: " + no_of_hours);
        System.out.println();
    }
}

class _21_a_classEmployeeInheritedByWorkerClass {
    public static void main(String[] args) {
        Worker w1 = new Worker(1, "Jack", "US", 9);
        Worker w2 = new Worker(2, "Harry", "UAE", 19);
        Worker w3 = new Worker(3, "Akane", "India", 16);
        w1.display_details();
        w2.display_details();
        w3.display_details();
    }
}