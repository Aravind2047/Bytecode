package tutor;

import java.util.Scanner;

public class Qestion6 {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet:");
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        input.close();

        Qestion6 result = new Qestion6();
        result.checkAlphabet(a);
    }

    void checkAlphabet(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is an alphabet.");
        } else {
            System.out.println("This is not an alphabet.");
        }
    }
}
