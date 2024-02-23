import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    void getdata(int l, int b) {
        length = l;
        breadth = b;
    }
    int rectArea() {
        return (length * breadth);
    }
}

class _12_a_classRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        System.out.print("Enter length: ");
        int length = s.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = s.nextInt();
        s.close();
        Rectangle r1 = new Rectangle();
        r1.getdata(length, breadth);
        int area = r1.rectArea();
        System.out.println("Area: " + area);
    }
}