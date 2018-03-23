package linkedlist;
public class LinkedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode ln = new LinkedListNode(2);
//		ln.insertNode(2);
//		ln.insertNode(3);
//		ln.insertNode(5);
		
		ln.insertNodeLast(4);
		ln.insertNodeLast(7);
		ln.insertNodeLast(9);
		
		ln.printNode();
		ln.deleteNode(3);
		
		System.out.println("");
		ln.printNode();

	}

}
