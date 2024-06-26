package control;

public class alpha {
	public static void main(String[] args) {
		max();
		
	}
	public static void max() {
		char ch = 'a';
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not Alphabet");
		}
	}

}
