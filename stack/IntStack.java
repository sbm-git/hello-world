package stack;

public class IntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackNode ns = new StackNode(5);
		ns.push(2);
		ns.push(5);
		ns.push(6);
		ns.push(7);
		ns.push(8);
		ns.push(9);
		ns.printStack();
		
		ns.popAll();
		
		
		//if (ns.isEmpty() == false) {
		//    System.out.println (ns.pop());
		//}

	}

}
