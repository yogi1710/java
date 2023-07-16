class Computer
{
    public void Mymusic(){
        System.out.println("Playing Music");
    }

    public int Cost(int a){
        return a; 
    }
}
public class Oops2 {
    public static void main(String[] args) {
        int cost = 40000;
        Computer comp = new Computer();
        comp.Mymusic();
        int res = comp.Cost(cost);
        System.out.println(res);
    }
}
