package assi;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        System.out.println("Enter the value of Length of Triangle");
        int a = T.nextInt();
        System.out.println("Enter the Value of width of Triangle");
        int b = T.nextInt();
        T.close();

        Question1 peri = new Question1(); 
        int result = peri.perimeter(a, b);
        System.out.println("The perimeter of the triangle is: " + result);
    }

    int perimeter(int a, int b) {
    	return 2*(a+b);
    }
}
    
