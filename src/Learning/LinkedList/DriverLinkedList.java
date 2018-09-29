package Learning.LinkedList;
/**
 * program to test DS LinkedList class and associated methods.
 * @author qqdipps
 *
 */
public class DriverLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList myLL = new LinkedList();
		myLL.head = new Node(100);
		Node second = new Node(200);
		Node third = new Node(300);
		
		myLL.head.next = second;
		second.next = third;
		
		myLL.insertBeg(50);
		myLL.insertEnd(350);
		myLL.insertAtValue(250, 200);
		myLL.insertAfterNthNode(2, 150);
		myLL.deleteFirst();
		myLL.deleteAtValue(150);
		myLL.deleteNode(second);
		myLL.printOut();
		
		
		
		

	}

}
