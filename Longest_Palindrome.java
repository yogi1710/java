// Question 7: Longest Palindromic Substring
import java.util.*;
class Longest_Palindrome {
    private static int expandAroundCenter(String valuString, int left, int right) {
        while (left >= 0 && right < valuString.length() && valuString.charAt(left) == valuString.charAt(right)) {
            left--;
            right++;
        }
        return right - left-1;
    }
    public static String longestPalindrome(String valuString) {
        if (valuString == null || valuString.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < valuString.length(); i++) {
            int len1 = expandAroundCenter(valuString, i, i);
            int len2 = expandAroundCenter(valuString, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return valuString.substring(start, end + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String val = sc.nextLine();
        String res = longestPalindrome(val);
        System.out.println(res);
    }
}