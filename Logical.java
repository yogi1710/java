public class Logical{
    public static void main(String[] args) {
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        //boolean result = x>y && a<b;
        boolean result = x>y || a<b;
        System.out.println(result);
        System.out.println(!result);
    }
}