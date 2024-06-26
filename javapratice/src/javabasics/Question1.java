package javabasics;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = A.nextInt();
        System.out.println("Enter the value of b");
        int b = A.nextInt();
        A.close();
        
        Question1 emmo = new Question1();
        int result = emmo.aravind(a, b);
        System.out.println("The sum of entered values is: " + result);
    }

     int aravind(int a, int b) {
        return a + b;
    }
}
