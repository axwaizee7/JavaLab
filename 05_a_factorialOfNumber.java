import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        int n, i, fact = 1;
        n = s.nextInt();
        s.close();
        System.out.printf("The Factorial of %d = ", n);
        for (i = 1; i <= n; i++)
            fact *= i;
        System.out.println(fact);
    }
}