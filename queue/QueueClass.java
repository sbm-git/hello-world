package queue;

public class QueueClass {
	private int q[];
	private int size;
	private int front;
	private int rear;
	private int total;
	
	public QueueClass(int size){
		this.size = size;
		this.front = 0;
		this.rear = 0;
		this.total =0;
		q = new int[this.size];
	}
	
	public boolean enQueue(int item){
		
		if(isFull() == true) {
			System.out.println("Full");
			return false;
		} else {
			//System.out.println("en" + rear);
			q[rear] = item;
			rear = (rear+1) % size;
			//++rear;
			total++;
			System.out.println("en-01" + rear + "  " + total + " item " + item);
			return true;
		}
	}
	
    public int deQueue(){
		
			int item = q[front];
			front = (front+1) % size;
			//++front;
			total--;
			return item;

	}

	private boolean isFull(){
		System.out.println("check  " + size + "  " + total);
		if (size==total){ 
			return true;
		} else {
			return false;
		}
	}
	
	
	public void showAll() {
		int f = front;
		for (int i=0; i<total; i++) {
			System.out.println (q[f]);
			++f;
		}
	}
}
