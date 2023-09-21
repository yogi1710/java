// Question 4: Java Subarray
import java.util.*;
import java.io.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int variable = scan.nextInt();
        int array_variable[] = new int[variable];
        // Iterate through the array_varable
        for(int i=0; i<variable; i++){
            array_variable[i] = scan.nextInt();
        }
        int flag = 0;
        for(int i=0; i<variable; i++) {
            int Sum = 0;
            for(int j=i; j<variable; j++) {
                Sum += array_variable[j];
                if (Sum < 0){
                    flag++;
                }
            }
        }
        System.out.println(flag);
    }
}