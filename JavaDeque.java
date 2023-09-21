// Question 9: Java Dequeue
import java.io.*;
import java.util.*;

public class JavaDeque {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Deque Dequeue = new ArrayDeque<>();
            HashSet<Integer> hash_set = new HashSet<>();
            int value1 = sc.nextInt();
            int value2 = sc.nextInt();
            int minimum = Integer.MIN_VALUE;
            for (int i = 0; i < value1; i++) {
                int number = sc.nextInt();
                Dequeue.add(number);
                hash_set.add(number);
            if (Dequeue.size() == value2) {
                if (hash_set.size() > minimum) minimum = hash_set.size();
                int temp = (int)Dequeue.remove();
                if (!Dequeue.contains(temp)) hash_set.remove(temp);
            }  
        }
            System.out.println(minimum);  
    }
}