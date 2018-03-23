package stack;

public class StackNode {
	private int stack[];
	private int top;
	private int size;
	
	
	public  StackNode (int size){
		this.size = size;
		this.top = -1;
	    stack = new int[this.size];
		
	}

	public boolean push(int item){
		if(!isFull()) {
			stack[++top] = item;
			return true;
		} else {
			return false;
		}
		
	}
	
	public int pop(){
		return stack[top--];
				
	}
	
	private boolean isFull(){
		System.out.println("full check  " + top  + " " + stack.length);
		return (top== stack.length -1);
	}
	
	public boolean isEmpty(){
		return (top== -1);
	}
	
	public void printStack(){
		for (int i=0; i<stack.length; i++ ){
		    System.out.println(stack[i] );
		}
	
	}
	
	public void popAll(){
		
			while(!isEmpty()) {
				System.out.println(pop() );
			}
		    
	
	}
}
