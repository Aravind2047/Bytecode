package ass2operator;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter the value 1:");
        int a = result.nextInt();
        System.out.println("Enter the value 2:");
        int b = result.nextInt();
        System.out.println("Enter the value 3:");
        int c = result.nextInt();
        System.out.println("Enter the value 4:");
        int d = result.nextInt();
        System.out.println("Enter the value 5:");
        int e = result.nextInt();
        result.close();

        avg(a, b, c, d, e);
    }

    public static void avg(int a, int b, int c, int d, int e) {
        int average = (a + b + c + d + e) / 5;
        System.out.println("The average is: " + average);
    }
}
