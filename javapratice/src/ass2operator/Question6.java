package ass2operator;

public class Question6 {
    public static void main(String[] args) {
        double PI = 3.14;
        int r = 23;
        double result1 = area(PI, r);
        System.out.println("Area of the circle: " + result1);
    }

    public static double area(double PI, int r) {
        double area_of_circle = PI * r * r;
        return area_of_circle;
    }
}
