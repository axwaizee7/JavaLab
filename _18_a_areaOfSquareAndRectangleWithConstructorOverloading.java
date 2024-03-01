import java.util.Scanner;

class Area {
    int length, breadth;

    Area(int x, int y) {
        length = x;
        breadth = y;
    }

    Area(int x) {
        length = breadth = x;
    }

    int area() {
        return length * breadth;
    }
}

class _18_a_areaOfSquareAndRectangleWithConstructorOverloading {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, squareArea, rectArea;
        System.out.print("Enter side of the square: ");
        x = s.nextInt();
        Area square = new Area(x);
        System.out.print("Enter length of the rectangle: ");
        x = s.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        y = s.nextInt();
        Area rectangle = new Area(x, y);
        squareArea = square.area();
        rectArea = rectangle.area();
        s.close();
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the rectangle: " + rectArea);
    }
}