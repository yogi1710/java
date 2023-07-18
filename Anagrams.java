import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        // Method 1 using Sorting 
        System.out.println("Method 1 using sorting method:");
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String st1 = new String(arr1);
        String st2 = new String(arr2);
        
        if(st1.equals(st2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }

    // Method 2 using index values ,here we take str1's values and remove them from str2 ,finally str2 should be empty then it is said as anagrams
    
}
