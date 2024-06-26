package Switch;

import java.util.Scanner;

public class tutor_joe {
	public static void main(String[] args) {
		Scanner result = new Scanner(System.in);
		int weeknumber = result.nextInt();
		result.close();
		
		switch (weeknumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wedesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		 default:
			 System.out.println("Entered value is invalid");
						
		
		}
		
	}

}
