package ass2operator;

public class Question9 {
    public static void main(String[] args) {
        int number = -15; 
        String sign = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The sign of " + number + " is: " + sign);
    }
}

