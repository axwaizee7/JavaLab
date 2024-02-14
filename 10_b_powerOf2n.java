import java.util.Scanner;

class PowerOf2n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n to find 2^n: ");
        int n = s.nextInt();
        s.close();
        double r = 1;
        for (int i = 0; i < n; i++)
            r *= 2;
        System.out.printf("2^%d = %.0f", n,  r);
    }
}