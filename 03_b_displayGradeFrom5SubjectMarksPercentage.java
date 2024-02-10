import java.util.Scanner;

class Gradefrompercentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0, perc;
        System.out.println("Enter 5 subject marks: ");
        for (int i = 0; i < 5; i++)
            total += s.nextDouble();
        s.close();
        perc = total / 500 * 100;
        System.out.printf("Total: %.2f\nPercentage: %.2f\nGrade: ", total, perc);
        if (perc > 80)
            System.out.println("A+");
        else if (perc > 70)
            System.out.println("A");
        else if (perc > 60)
            System.out.println("B+");
        else if (perc > 50)
            System.out.println("B");
        else if (perc > 40)
            System.out.println("C");
        else if (perc > 35)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
