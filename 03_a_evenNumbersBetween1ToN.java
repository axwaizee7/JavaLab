import java.util.Scanner;

class Evennumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();
        s.close();
        System.out.printf("Even numbers between 1 to %d are:", n);
        for (int i = 2; i <= n; i += 2)
            System.out.print(" " + i);
    }
}