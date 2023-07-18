import java.util.*;

public class TokensUsingSplit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence = sentence.trim();
        String arr[] = sentence.split("\\W+");
        System.out.println(arr.length);
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
