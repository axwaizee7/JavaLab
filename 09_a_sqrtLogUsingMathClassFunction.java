import java.util.Scanner;
import java.lang.Math;

class SqrtLog {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double n;
        System.out.print("Enter a number to find its square root and logrithm: ");
        n = s.nextDouble();
        s.close();
        System.out.printf("Square root: %.2f\nLogrithm: %.2f", Math.sqrt(n), Math.log(n));
    }
}