import java.util.Scanner;

class Rectangle {
    int length, width;

    Rectangle(int x, int y) {
        length = x;
        width = y;
    }

    int rectArea() {
        return length * width;
    }
}

class _13_a_javaRectangleAreaConstructor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length, width, area1;
        System.out.print("Enter the length of the rectangle: ");
        length = s.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width = s.nextInt();
        s.close();
        Rectangle r1 = new Rectangle(length, width);
        area1 = r1.rectArea();
        System.out.println("Area = " + area1);
    }
}