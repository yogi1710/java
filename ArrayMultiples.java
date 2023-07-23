// Question 1: Cumulative Multiple of an Array with exception handling
import java.util.*;
public class ArrayMultiples {
	public static int arrayProduct(int arr[], int n_value) {
		int total_product = 1;
		for (int i = 0; i<n_value; i++) {
			total_product = total_product * arr[i];
		}
		return total_product;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_value = sc.nextInt();
		int arr[] = new int[n_value];
		for(int i = 0;i<n_value;i++){
			arr[i] = sc.nextInt();
		}
		int product_of_given_values = 0;
		try {
			product_of_given_values = arrayProduct(arr, n_value);
		} catch (Exception error) {
			error.printStackTrace();
		}
		System.out.print(product_of_given_values);
	}

}