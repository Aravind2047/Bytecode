package Switch;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner input = new Scanner(System.in);
        char a = input.next().charAt(0);
        input.close();

        switch (a) {
            case 'a':
            case 'A':
                System.out.println("a is a vowel.");
                break;
            case 'e':
            case 'E':
                System.out.println("e is a vowel.");
                break;
            case 'i':
            case 'I':
                System.out.println("i is a vowel.");
                break;
            case 'o':
            case 'O':
                System.out.println("o is a vowel.");
                break;
            case 'u':
            case 'U':
                System.out.println("u is a vowel.");
                break;
            default:
                System.out.println("This is a consonant.");
        }
    }
}
