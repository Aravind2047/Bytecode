package ass2operator;

public class question5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        int num4 = 30;

        int max = (num1 > num2)
                ? ((num1 > num3)
                    ? ((num1 > num4) ? num1 : num4)
                    : ((num3 > num4) ? num3 : num4))
                : ((num2 > num3)
                    ? ((num2 > num4) ? num2 : num4)
                    : ((num3 > num4) ? num3 : num4));

        System.out.println("The greatest number is: " + max);
    }
}
