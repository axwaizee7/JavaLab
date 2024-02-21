import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, rev=0, rem, temp;
        System.out.print("Enter a number to find the reverse of a number: ");
        n = s.nextInt();
        s.close();
        temp=n;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        System.out.printf("Original number = %d\nReversed number = %d", n, rev);
    }
}