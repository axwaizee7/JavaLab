class Figure {
    int length;

    Figure(int l) {
        length = l;
    }

    void area() {
        System.out.println("Area: " + length * length);
    }
}

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + length * breadth);
    }

}

class _24_a_overridingFigureAndRectangleClassAreaMethod {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.area();
    }
}