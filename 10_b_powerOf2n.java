import java.util.Scanner;

class PowerOf2n {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter n to find power of 2: ");
        int n = s.nextInt();
        s.close();
        double r = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0)
                System.out.printf("2^%d = 1\n", i);
            else {
                r *= 2;
                System.out.printf("2^%d = %.0f\n", i, r);
            }
        }
    }
}