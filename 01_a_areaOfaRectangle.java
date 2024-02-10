import java.util.Scanner;

class Areaofarectangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = s.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = s.nextDouble();
        System.out.printf("Area of the rectangle: %.2f", length * breadth);
        s.close();
    }
}