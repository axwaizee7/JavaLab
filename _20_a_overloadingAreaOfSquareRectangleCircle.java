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

class _20_a_overloadingAreaOfSquareRectangleCircle{
    public static void main(String[] args) {
        Area a = new Area();
        double square_area = a.area(7);
        System.out.println(square_area);
    }
}