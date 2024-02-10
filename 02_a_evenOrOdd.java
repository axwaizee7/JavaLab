import java.util.Scanner;

class Checkevenorodd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd: ");
        int n = s.nextInt();
        s.close();
        if (n % 2 == 0)
            System.out.printf("%d is even.", n);
        else
            System.out.printf("%d is odd.", n);
    }
}