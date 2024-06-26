package ass2operator;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a = result.nextInt();
        System.out.println("Enter the value of B:");
        int b = result.nextInt();
        result.close();

        arth(a, b);
    }

    public static void arth(int a, int b) {
        System.out.println("The sum of a + b: " + (a + b));
        System.out.println("The sub of a - b: " + (a - b));
        System.out.println("The mul of a * b: " + (a * b));
        System.out.println("The quo of a / b: " + (a / b));
        System.out.println("The rem of a % b: " + (a % b));
    }
}
