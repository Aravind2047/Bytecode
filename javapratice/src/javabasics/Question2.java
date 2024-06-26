package javabasics;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner B = new Scanner(System.in);
        int a = B.nextInt();
        B.close();

        Question2 instance = new Question2();
        String result = instance.isEven(a);
        System.out.println(result);
    }

    public String isEven(int a) {
        if (a % 2 == 0) {
            return "True";
        } else {
            return "False";
        }
    }
}
