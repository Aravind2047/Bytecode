package control;

public class leap {
	public static void main(String[] args) {
		max();
	}
	public static void max() {
		int n = 2024;
		if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)) {
			System.out.println("leap");

		}
		else {
			System.out.println("leap kadu");
		}
	}

}
