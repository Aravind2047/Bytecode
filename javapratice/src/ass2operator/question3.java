package ass2operator;

public class question3 {
    int a = 55;
    int b = 70;
    
    public static void main(String[] args) {
        question3 obj = new question3();
        compare(obj.a, obj.b);
    }
    
    public static boolean compare(int a, int b) {
        boolean result = (a < 50) && (a < b);
        System.out.println(result);
        return result;
    }
}
