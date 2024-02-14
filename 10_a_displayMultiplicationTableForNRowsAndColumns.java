import java.util.Scanner;

class Multiplicationtable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r, c, ir, ic;
        System.out.print("Enter the number of table rows: ");
        r = s.nextInt();
        System.out.print("Enter the number of table columns: ");
        c = s.nextInt();


        // For Loop
        for (ir = 1; ir <= r; ir++) {
            for (ic = 1; ic <= c; ic++)
                System.out.printf("%4d", ir * ic);
            System.out.println();
        }
        

        // Do While loop
        // ir =1;
        // do {
        //     ic=1;
        //     do {
        //         System.out.printf("%4d", ir * ic);
        //         ic++;
        //     } while (ic<=c);
        //     System.out.println();
        //     ir++;
        // } while (ir<=r);


        // While Loop
        // ir =1;
        // while (ir <=r){
        //     ic=1;
        //     while (ic<=c) {
        //         System.out.printf("%4d", ir * ic);
        //         ic++;
        //     }
        //     System.out.println();
        //     ir++;
        // } 
    }
}