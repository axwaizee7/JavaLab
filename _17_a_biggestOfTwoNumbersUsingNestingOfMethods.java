import java.util.Scanner;

class Nesting {
    int m, n;

    Nesting(int x, int y) {
        m = x;
        n = y;
    }

    int largest() {
        if (m >= n)
            return m;
        else
            return n;
    }

    void display() {
        int large = largest();
        System.out.println("Largest value = " + large);
    }
}

class _17_a_biggestOfTwoNumbersUsingNestingOfMethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y;
        System.out.print("Enter the first number: ");
        x = s.nextInt();
        System.out.print("Enter the second number: ");
        y = s.nextInt();
        Nesting nest = new Nesting(x, y);
        nest.display();
        s.close();
    }
}