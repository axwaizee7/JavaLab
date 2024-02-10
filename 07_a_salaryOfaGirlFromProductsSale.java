import java.util.Scanner;

class Salary {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sales: ");
        double x = s.nextDouble();
        s.close();
        System.out.printf("Salary: %.2f", ((x != 40) ? ((x < 40) ? (4 * x + 100) : (4.5 * x + 150)) : 300));

        // JUST FOR PRACTICE
        
        // System.out.print("Salary : ");
        // if (x != 40) {
        //     if (x < 40)
        //         System.out.println(4 * x + 100);
        //     else
        //         System.out.println(4.5 * x + 150);
        // } else
        //     System.out.println(300);

    }
}