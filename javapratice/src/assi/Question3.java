package assi;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of Robert");
        Scanner Rob = new Scanner(System.in);
        int a = Rob.nextInt();
        int b = Rob.nextInt();
        int c = Rob.nextInt();
        Rob.close();
        
        int totalMarks = result(a, b, c);
        double percentage = calculatePercentage(totalMarks);
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
    
    static int result(int a, int b, int c) {
        return a + b + c;
    }

    static double calculatePercentage(int totalMarks) {
        return (totalMarks / 3.0);
    }
}
