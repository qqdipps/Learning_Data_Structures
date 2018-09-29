package Learning.LinkedList;

public class ObjLinks extends LinkedList {
	
	public void printOut(){
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data + "");
			temp = temp.next;
		}
	}
	

}
