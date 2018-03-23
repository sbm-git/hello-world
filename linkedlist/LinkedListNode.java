package linkedlist;

public class LinkedListNode {
	Node head = new Node();
	
	public LinkedListNode(int value){
		//System.out.println("first " + value );
		head.value = value;
		head.link = null;
	}
	
	public boolean insertNode(int val){
		Node n = new Node();
		n.value = val;
		n.link = head;
		head = n;
		
		return true;
	}
	
	public boolean insertNodeLast(int val){
		//System.out.println(val );
		Node n = new Node();
		n.value = val;
		n.link = null;

		Node h = head;
		while (h.link != null) {
			h = h.link;
		}
		
		h.link = n;
		return true;
	}
	
	
	
	public boolean deleteNode(int val){
		boolean ret = false;
		System.out.println("del " + val );
		
		Node h = head;
		if (h.value == val) {
			head = h.link;
			ret = true;
			return ret;
		}
		System.out.println("del oth node " + h.value );
		
		while (h.link != null) {
			if (h.link.value == val ) {
				if ( h.link.link != null) {
					h.link = h.link.link;
				} else {
					h.link = null;
				}
				ret = true;
				break;
			}
			h = h.link;
		}
		return ret;
	}
	
	
	
	public boolean printNode(){
		Node h = head;
		while (h != null) {
			System.out.println(h.value );
			h = h.link;
		}
		return true;
	}
	
	class Node{
		int value;
		Node link;
	}

}
