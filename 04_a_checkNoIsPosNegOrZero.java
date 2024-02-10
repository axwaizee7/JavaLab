import java.util.Scanner;

class Checkifpositivenegativeorzero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Enter a number to check if +ve, -ve or zero: ");
        number = s.nextInt();
        s.close();
        if (number != 0) {
            if (number > 0)
                System.out.println(number + " is +ve.");
            else
                System.out.println(number + " is -ve.");
        } else
            System.out.println(number + " is zero.");
    }
}
