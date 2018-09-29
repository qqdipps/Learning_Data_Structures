package Learning.LinkedList;

/**
 * Creating class Node for practice.
 * @author qqdipps
 *
 */

public class Node {
	Node next; //used as pointer(link) to next node/
	int data;
	/**
	 * constructor sets param to data and initiates next as null.
	 * @param data
	 */
	Node(int data){
		this.data = data;
		next = null;
		
	}

}
