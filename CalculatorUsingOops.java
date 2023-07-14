class Calculator{
    public int add(int n1,int n2)
    {
        System.out.println("Add: ");
        return n1+n2;
    }
}
public class CalculatorUsingOops {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;

        Calculator cal =new Calculator();
        int res = cal.add(a,b);
        System.out.println(res);
    }    
}