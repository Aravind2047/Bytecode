package tutor;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
        System.out.println("Enter the first value:");
        Scanner Exercises = new Scanner(System.in);
        int a = Exercises.nextInt();
        System.out.println("Enter the second value:");
        int b = Exercises.nextInt();
        System.out.println("Enter the third Value");
        int c = Exercises.nextInt();
        Exercises.close();
        
        if(a>b && a>c) {
        	System.out.println(a);
        }
        else if(b<a && b<c) {
        	System.out.println(b);
        }
        else {
        	System.out.println(c);
        }
        
	}

}
