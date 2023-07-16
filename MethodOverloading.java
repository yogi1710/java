class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,int b){
        return a+b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator addition = new Calculator();
        int val1 = addition.add(2,8);
        int val2 = addition.add(10,50,60);
        double val3 = addition.add(50.215,50);
        System.out.println(val1+" "+val2+" "+val3);  
    }
}
