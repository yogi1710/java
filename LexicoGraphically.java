import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String variable = sc.nextLine();
        int value = sc.nextInt();
        String smallest = variable;
        String largest = "";
        for(int i = 0;i<variable.length()-value+1;i++){
            String sub = variable.substring(i,i+value);
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if(sub.compareTo(largest)>0){
                largest = sub;
            }
        }
        System.out.println(smallest+"\n"+largest);
    }
}
