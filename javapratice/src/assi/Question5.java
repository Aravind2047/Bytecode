package assi;

import java.util.Scanner;

public class Question5 {
	
	 public static void main(String[] args) {
	        Scanner T = new Scanner(System.in);
	        System.out.println("Enter the value of Length of Triangle");
	        int a = T.nextInt();
	        System.out.println("Enter the Value of width of Triangle");
	        int b = T.nextInt();
	        System.out.println("Enter the value");
	        int c = T.nextInt();
	        T.close();

	         
	        int result = perimeter(a, b, c);
	        System.out.println("The perimeter of the triangle is: " + result);
	    }

	     static int perimeter(int a, int b,int c) {
	    	return a+b+c;
	    }
}
