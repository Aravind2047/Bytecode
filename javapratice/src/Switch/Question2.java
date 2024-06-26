package Switch;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		System.out.println("The Value of Gender");
		Scanner result = new Scanner(System.in);
		String Gender = result.nextLine();
		switch(Gender) {
		case "F":
			System.out.println("The gender is Female");
			break;
		case "M":
			System.out.println("The gender is MAle");
			break;
			default:
				System.out.println("Others");
		}
		
		
	}

}
