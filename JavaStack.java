// Question 8: Java Stack
import java.util.*;
class JavaStack{
	public static boolean didSatisfiy(String s) {
        Stack<Character> stack = new Stack<>();

        for (char character : s.toCharArray()) {
            if (character == '[' || character == '{' || character == '(') {
                stack.push(character);
            }else if (character == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (character == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (character == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String val=sc.next();
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add(val);
        for (String s : array_list) {
            System.out.println(didSatisfiy(s));
        }
		}
		
	}
}