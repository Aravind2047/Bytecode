package control;

public class max3num {
	public static void main(String[] args) {
		max();
		
	}
	public static void max() {
		int a=15;
		int b =18;
		int c = 20;
		if(a>b && a>c) {
			System.out.println("A is max");
		}
		else if (b>c && b>a) {
			System.out.println("B is max");
		}
		else {
			System.out.println("C is max");
		}
	}

}
