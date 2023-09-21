// Question 5: Merge and Sort the elements in two Linked-List
class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void add(int data) {
        Node variable_node = new Node(data);
        if (head == null) {
            head = variable_node;
        } else {
            Node present_node = head;
            while (present_node.next != null) {
                present_node = present_node.next;
            }
            present_node.next = variable_node;
        }
    }
    public void getmergedandsortedLLinkedList(LinkedList taken_list_one, LinkedList taken_list_two) {
        Node Node_one = taken_list_one.head;
        Node Node_two = taken_list_two.head;
        while (Node_one != null && Node_two != null) {
            if (Node_one.data < Node_two.data) {
                add(Node_one.data);
                Node_one = Node_one.next;
            } else {
                add(Node_two.data);
                Node_two = Node_two.next;
            }
        }
        while (Node_one != null) {
            add(Node_one.data);
            Node_one = Node_one.next;
        }
        while (Node_two != null) {
            add(Node_two.data);
            Node_two = Node_two.next;
        }
    }
    public void getsortedlist() {
        if (head == null || head.next == null) {
            return;
        }
        boolean reverse;
        Node value;
        Node varNode = null;
        do {
            reverse = false;
            value = head;
            while (value.next != varNode) {
                if (value.data > value.next.data) {
                    int temp = value.data;
                    value.data = value.next.data;
                    value.next.data = temp;
                    reverse = true;
                }
                value = value.next;
            }
            varNode = value;
        } while (reverse);
    }
    public void getdisplay() {
        Node present_node = head;
        while (present_node != null) {
            System.out.print(present_node.data + "->");
            present_node = present_node.next;
        }
        System.out.println("null");
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Merge_and_sort {
    public static void main(String[] args) {
        LinkedList taken_list_one = new LinkedList();
        taken_list_one.add(25);
        taken_list_one.add(35);
        taken_list_one.add(12);
        taken_list_one.add(4);
        taken_list_one.add(36);
        taken_list_one.add(48);
        LinkedList taken_list_two = new LinkedList();
        taken_list_two.add(8);
        taken_list_two.add(32);
        taken_list_two.add(22);
        taken_list_two.add(45);
        taken_list_two.add(63);
        taken_list_two.add(49);
        LinkedList mergedList = new LinkedList();
        mergedList.getmergedandsortedLLinkedList(taken_list_one, taken_list_two);
        System.out.print("sorted list : ");
        mergedList.getsortedlist();
        mergedList.getdisplay();
    }
}
