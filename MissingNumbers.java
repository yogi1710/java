// Question 2: Finding MissingNumbers in an array
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MissingNumbers {
	
	public static List<Integer> missingNumbers(int array_variable[]) {
		List<Integer> listed_values = new ArrayList<>();
		int BeforeNumber = array_variable[0];
        for (int i = 1; i < array_variable.length; i++) {
            int PresentNumber = array_variable[i];            
            if (PresentNumber - BeforeNumber > 1) {
                for (int j = BeforeNumber + 1; j < PresentNumber; j++) {
                    listed_values.add(j);
                }
            }
            BeforeNumber = PresentNumber;
        }
		return listed_values;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int variable = scan.nextInt();
        int array_variable[] = new int[variable];
        for(int i=0; i<variable; i++){
            array_variable[i] = scan.nextInt();
        }
		List<Integer> result = missingNumbers(array_variable);
		System.out.println(result);

	}

}