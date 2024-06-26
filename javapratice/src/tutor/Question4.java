package tutor;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner time = new Scanner(System.in);
		int a = time.nextInt();
		time.close();
		Question4 result = new Question4();
		result.leap(a);
		
	}
	int leap(int a) {
		if( a/4 == 0 && a/400 == 0 && a/100 == 0) {
			System.out.println("This is a leap year");
			
		}
		else {
			System.out.print(" this is not a leap");
		}
		return 1;
		
	}
	

}
