import java.util.Scanner;

class Arithmetic_operator {
    float add(float num1, float num2) {
        return num1 + num2;
    }

    float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    float division(float num1, float num2) {
        return num1 / num2;
    }

    float substraction(float num1, float num2) {
        return num1 - num2;
    }
}

class _14_a_arithmeticOperatorClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float n1, n2, ad, mul, div, subs;
        
        System.out.print("Enter first operand: ");
        n1 = s.nextFloat();
        System.out.print("Enter second operand: ");
        n2 = s.nextFloat();
        s.close();
        
        Arithmetic_operator Ao = new Arithmetic_operator();

        ad = Ao.add(n1, n2);
        mul = Ao.multiplication(n1, n2);
        div = Ao.division(n1, n2);
        subs = Ao.substraction(n1, n2);
        
        System.out.println("Add: " + ad);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Substraction: " + subs);
    }
}