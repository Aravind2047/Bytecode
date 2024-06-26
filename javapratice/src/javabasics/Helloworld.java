package javabasics;

import java.util.Scanner;

public class Helloworld {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = input.nextLine();
				System.out.println("The is your name "+name);
	}

}
