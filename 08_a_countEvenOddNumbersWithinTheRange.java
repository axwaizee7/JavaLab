import java.util.Scanner;

class Countevenodd {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int even = 0, odd = 0, n;
        System.out.print("Enter n: ");
        n = s.nextInt();
        s.close();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.printf("\nEven numbers: %d\nOdd numbers: %d", even, odd);
    }
}