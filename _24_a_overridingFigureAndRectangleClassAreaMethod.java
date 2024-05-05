class Figure {
    int length;

    Figure(int l) {
        length = l;
    }

    void area() {
        System.out.println("Figure Area: " + length * length);
    }
}

class Rectangle extends Figure{
    int breadth;

    Rectangle(int l, int b) {
        super(l);
        breadth = b;
    }

    void area() {
        System.out.println("Rectangle Area: " + length * breadth);
    }

}

class _24_a_overridingFigureAndRectangleClassAreaMethod {
    public static void main(String[] args) {
        Figure figure = new Figure(4);
        Rectangle rectangle = new Rectangle(4, 6);
        figure.area();
        rectangle.area();
    }
}