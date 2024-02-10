import java.util.Scanner;

class Biggestofthreenumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers to find the biggest");
        double n1, n2, n3;
        System.out.print("Enter first number: ");
        n1 = s.nextDouble();
        System.out.print("Enter second number: ");
        n2 = s.nextDouble();
        System.out.print("Enter third number: ");
        n3 = s.nextDouble();
        s.close();
        System.out.print("The biggest number is: ");
        if (n1 >= n2) {
            if (n1 >= n3)
                System.out.println(n1);
            else
                System.out.println(n3);
        } else {
            if (n2 >= n3)
                System.out.println(n2);
            else
                System.out.println(n3);
        }
    }
}