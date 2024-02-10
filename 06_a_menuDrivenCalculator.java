import java.util.Scanner;

class Menudrivencalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b;
        System.out.print("\nEnter a number: ");
        a = s.nextDouble();
        System.out.print("Enter another number: ");
        b = s.nextDouble();
        System.out.println("\n       Menu       ");
        System.out.println("------------------");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Multiplication");
        System.out.println(" 3. Division");
        System.out.println(" 4. Remainder");
        System.out.print("Enter choice: ");
        int choice = s.nextInt();
        s.close();
        switch (choice) {
            case 1:
                System.out.println("\nResult: " + (a + b));
                break;
            case 2:
                System.out.println("\nResult: " + (a * b));
                break;
            case 3:
                System.out.println("\nResult: " + (a / b));
                break;
            case 4:
                System.out.println("\nResult: " + (a % b));
                break;
            default:
                System.out.println("\nInvalid choice!!");
        }
    }
}
