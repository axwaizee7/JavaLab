import java.util.Scanner;

class Room{
    int length, breadth;

    Room(int x, int y){
        length = x;
        breadth = y;
    }
    int area(){
        return length*breadth;
    }
}

class Bedroom extends Room{
    int height;
    Bedroom(int x, int y, int z){
        super(x, y);
        height = z;
    }
    int volume(){
        return length*breadth*height;
    }
}


class _16_a_singleInheritance{
    public static void main(String[] args) {
        int length, breadth, height, area, volume;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = s.nextInt();
        System.out.print("Enter the breadth: ");
        breadth= s.nextInt();
        System.out.print("Enter the heigth: ");
        height = s.nextInt();
        s.close();
        Bedroom bedroom = new Bedroom(length, breadth, height);
        area = bedroom.area();
        volume = bedroom.volume();
        System.out.printf("Area of the Bedroom = %d\nVolume of Bedroom = %d", area, volume);

    }
}