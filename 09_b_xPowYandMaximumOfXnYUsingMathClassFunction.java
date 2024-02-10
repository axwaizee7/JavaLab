import java.util.Scanner;
import java.lang.Math;

class PowerAndMaximum {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double x, y;
        System.out.println("Enter two number to find x^y and maximum of x and y");
        System.out.print("Enter x: ");
        x = s.nextDouble();
        System.out.print("Enter y: ");
        y = s.nextDouble();
        s.close();
        System.out.printf("x^y: %.2f\nMaximum: %.2f", Math.pow(x, y), Math.max(x, y));
    }
}