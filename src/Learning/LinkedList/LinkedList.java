package Learning.LinkedList;
/**
 * Creating Linked list for practice of data structures. 
 * @author qqdipps
 *
 */
public class LinkedList {
	Node head;

	/**
	 * Method prints out Linked List.
	 */
	public void printOut(){
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + "");
			temp = temp.next;
		}
	}
	
	/**
	 * Method inserts node to beginning of Linked List.
	 * @param data
	 */
	public void insertBeg(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;	
	}
	
	/**
	 * Method inserts node to end of Linked List.
	 * @param data
	 */
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	/**
	 * Method inserts new node(data1) after first occurrence of node.data2 == node.data1.
	 * @param data1
	 * @param data2
	 */
	public void insertAtValue(int data1, int data2) {
		Node newNode = new Node(data1);
		Node temp = head;
		while (temp.data != data2) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	/**
	 * Method inserts new node(data) after the nth number node.
	 * @param nThNode
	 * @param data
	 */
	public void insertAfterNthNode(int nThNode, int data) {
		Node newNode = new Node(data);
		Node temp = head;
		for(int i = 1; i < nThNode; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	/**
	 * Method deletes first node.
	 */
	public void deleteFirst() {
		Node temp = head;
		head = temp.next;
	}
	
	/**
	 * Method deletes node where data = node.data.
	 * @param data
	 */
	public void deleteAtValue(int data) {
		Node temp = head;
		while (data != temp.next.data) {
			temp = temp.next;
		}
		Node temp2 = temp.next.next;
		temp.next = temp2;
	}
		
	/**
	 * Deletes node using swapping instead of traversing LL thus O(1) 
	 * instead O(n). Assumes LL is >2 and node to delete is not at end.
	 * @param node
	 */
    public void deleteNode(Node node) {
	    node.data = node.next.data;
	    node.next = node.next.next;	
	}
}



