class Area {
    int area(int l, int b) {
        return l * b;
    }

    int area(int s) {
        return s * s;
    }

    double area(double r) {
        return 3.14 * r * r;
    }
}

class _20_a_overloadingAreaOfSquareRectangleCircle {
    public static void main(String[] args) {
        Area a = new Area();
        int square_area = a.area(7);
        int rect_area = a.area(7, 14);
        double circle_area = a.area(7.8);
        System.out.println("Area of Square: " + square_area);
        System.out.println("Area of Rectangle: " + rect_area);
        System.out.println("Area of Square: " + circle_area);
    }
}