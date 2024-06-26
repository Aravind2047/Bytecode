package tutor;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {
        System.out.println("Enter the first value:");
        Scanner Exercises = new Scanner(System.in);
        int a = Exercises.nextInt();
        System.out.println("Enter the second value:");
        int b = Exercises.nextInt();
        Exercises.close();

        ifstatement result = new ifstatement();
        result.maximum(a, b);
    }

    int  maximum(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
        	System.out.println(b);
        }
        return 1;
    }
}
