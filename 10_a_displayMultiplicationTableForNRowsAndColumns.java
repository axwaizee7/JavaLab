import java.util.Scanner;

class Multiplicationtable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c, ir, ic;
        System.out.print("Enter the number of table rows: ");
        r = s.nextInt();
        System.out.print("Enter the number of table columns: ");
        c = s.nextInt();
        for (ir = 1; ir <= r; ir++) {
            for (ic = 1; ic <= c; ic++)
                System.out.printf("%4d", ir * ic);
            System.out.println();
        }
    }
}