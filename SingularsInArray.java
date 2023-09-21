// Question 3 : Find the count of singulars in array
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class SingularsInArray {
	public static int countSingleSock(int arrNum[]) {
		Map <Integer, Integer> Count = new HashMap<>();
		for (int sock : arrNum) {
			Count.put(sock, Count.getOrDefault(sock, 0) +1);
		}
		int single_sock = 0;
		for(int sockId : Count.keySet()) {
			int sockCount = Count.get(sockId);
			if (sockCount%2 != 0) {
				single_sock++;
			}
		}
		return single_sock;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		int array_variable[] = new int[var];
		for(int i=0; i<var; i++){
            array_variable[i] = sc.nextInt();
        }
		int singularSocksCount = countSingleSock(array_variable);
		System.out.println("Count of singular socks = " + singularSocksCount);

	}

}