package ass2operator;

public class Question8 {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = 'B';

        boolean isEqual = char1 == char2;
        boolean isNotEqual = char1 != char2;
        boolean isGreater = char1 > char2;
        boolean isLess = char1 < char2;

        System.out.println("char1 == char2: " + isEqual);
        System.out.println("char1 != char2: " + isNotEqual);
        System.out.println("char1 > char2: " + isGreater);
        System.out.println("char1 < char2: " + isLess);
    }
}
