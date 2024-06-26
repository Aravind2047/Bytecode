package control;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter the service period (in years):");
        int a = result.nextInt();
        result.close();
        
        Driver(a); 
    }
    
    public static void Driver(int a) {
        float bonusAmount = 0.0f;
        
        if (a >= 5) {
            bonusAmount = a * 1.0f;
        } else if (a >= 4) {
            bonusAmount = a * 0.5f;
        } else if (a >= 3) {
            bonusAmount = a * 0.25f;
        } else if (a >= 2) {
            bonusAmount = a * 0.1f;
        } else {
            System.out.println("Invalid service period.");
            return;
        }
        
        System.out.println("Enter your Salary:");
        Scanner input = new Scanner(System.in);
        float salary = input.nextFloat();
        input.close();
        
        float totalBonus = salary * bonusAmount;
        System.out.println("The bonus amount: " + totalBonus);
    }
}
