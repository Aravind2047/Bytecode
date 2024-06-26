package control;

public class upper {
    public static void main(String[] args) {
        max();
    }

    public static void max() {
        char ch = 'A'; 

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("uppercase");
        } else {
            System.out.println("not a letter");
        }
    }
}
