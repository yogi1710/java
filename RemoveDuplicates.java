// Question 6: Remove Duplicates from Linked-List
import java.util.Scanner;
import java.util.HashSet;
class Linkedlist {
	Node head;
	public Linkedlist() {
		this.head = null;
	}
	
	public void addition(int val) {
		Node New_Node = new Node(val);
		if(head == null) {
			head = New_Node;
		}
		else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = New_Node;
		}
	}
	
	public void remove_values() {
		if (head ==  null) {
			return;
		}
		HashSet<Integer> unique_values = new HashSet<>();
		Node Node_value = head;
		Node previousNode = null;
		while(Node_value != null) {
			if(unique_values.contains(Node_value.value)) {
				previousNode.next = Node_value.next;
			}
			else {
				unique_values.add(Node_value.value);
				previousNode = Node_value;
			}
			Node_value = Node_value.next;
		}
	}
	public void display() {
		Node Node_value = head;
		while(Node_value != null) {
			System.out.print(Node_value.value+"->");
			Node_value = Node_value.next;
		}
		System.out.println("null");
	}
	
}

class Node {
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
}

public class RemoveDuplicates{

	public static void main(String[] args) {
		Linkedlist variable = new Linkedlist();
		variable.addition(2);
		variable.addition(5);
		variable.addition(12);
		variable.addition(2);
		variable.addition(3);
		variable.addition(5);
		variable.addition(1);
		variable.addition(2);
		variable.addition(5);
		variable.addition(5);
		System.out.println("Input : ");
		variable.display();
		variable.remove_values();
		System.out.println("Output : ");
		variable.display();
	}
}
