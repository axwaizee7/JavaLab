import java.util.Scanner;

class Employee {
    String n, adr;
    double bsc_slry, total_salary, hra_perc = 0.25, hra;

    int employee_id;
    static int emp_id = 846;

    Employee(String name, String address, double basic_salary) {
        employee_id = ++emp_id;
        n = name;
        adr = address;
        bsc_slry = basic_salary;
        hra = bsc_slry * hra_perc;
        total_salary = bsc_slry + hra;
    }

    void emp_details() {
        System.out.println("Employee id: " + employee_id);
        System.out.println("Employee name: " + n);
        System.out.println("Employee address: " + adr);
        System.out.println("Employee basic salary: " + bsc_slry);
        System.out.println("Employee total salary: " + total_salary);
    }

    void salary() {
        System.out.println("Employee basic salary: " + bsc_slry);
        System.out.println("Employee total salary: " + total_salary);
    }
}

class _15_a_employeeClass_sumOfThreeEmployeeSalary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name, address;
        double basic_salary, sumOfSalary;
        
        System.out.println("\nFor 1st employee");
        System.out.println("----------------");
        System.out.print("Enter employee name: ");
        name = s.nextLine();
        System.out.print("Enter employee address: ");
        address = s.nextLine();
        System.out.print("Enter employee basic salary: ");
        basic_salary = s.nextDouble();
        s.nextLine();
        Employee emp1 = new Employee(name, address, basic_salary);
        
        System.out.println("\nFor 2nd employee");
        System.out.println("----------------");
        System.out.print("Enter employee name: ");
        name = s.nextLine();
        System.out.print("Enter employee address: ");
        address = s.nextLine();
        System.out.print("Enter employee basic salary: ");
        basic_salary = s.nextDouble();
        s.nextLine();
        
        Employee emp2 = new Employee(name, address, basic_salary);
        
        System.out.println("\nFor 3rd employee");
        System.out.println("----------------");
        System.out.print("Enter employee name: ");
        name = s.nextLine();
        System.out.print("Enter employee address: ");
        address = s.nextLine();
        System.out.print("Enter employee basic salary: ");
        basic_salary = s.nextDouble();
        s.nextLine();
        Employee emp3 = new Employee(name, address, basic_salary);
        
        s.close();
        
        System.out.println("\n1st employee details");
        emp1.emp_details();
        System.out.println("\n2nd employee details");
        emp2.emp_details();
        System.out.println("\n3rd employee details");
        emp3.emp_details();
        
        System.out.println();
        System.out.println("\n1st employee salary");
        emp1.salary();
        System.out.println("\n2nd employee salary");
        emp2.salary();
        System.out.println("\n3rd employee salary");
        emp3.salary();
        System.out.println();
        
        sumOfSalary = emp1.total_salary +emp2.total_salary+emp3.total_salary;
        System.out.println("Sum of the salary of threee employee = " + sumOfSalary);
    }
}