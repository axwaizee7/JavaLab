import java.util.Scanner;

class Areaofacircle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        double pi = 3.1415;
        System.out.print("Enter radius of the circle: ");
        double radius = s.nextDouble();
        System.out.printf("Area of the rectangle: %.2f", pi * radius * radius);
        s.close();
    }
}