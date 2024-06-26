package javabasics;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);
        int a = R.nextInt();
        int b = R.nextInt();
        R.close();

        Return row = new Return();
        int sum = row.return1(a, b); 
        System.out.println(sum);
    }

    int return1(int a, int b) {
        return a + b;
    }
}
