package tutor;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = time.nextInt();
        System.out.println("Enter the value:");
        int b = time.nextInt();
        time.close();

        question3 result = new question3();
        result.divisible(a, b);  
    }

    int divisible(int a, int b) {
        if(a % b == 0) {
            System.out.println("The value is divisible");
        } else {
            System.out.println("The value is not divisible");
        }
        return 0;  
    }
}
