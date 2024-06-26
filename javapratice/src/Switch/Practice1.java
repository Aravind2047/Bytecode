package Switch;

public class Practice1 {
    public static void main(String[] args) {
        int i = 5;
        switch (i) {
            case 1:
                System.out.println("The value of i is 1");
                break;
            case 2:
                System.out.println("The value of i is 2");
                break;
            case 3:
                System.out.println("The value of i is 3");
                break;
            default:
                System.err.println("The value of i is not 1, 2, or 3");
                break;
        }
    }
}
