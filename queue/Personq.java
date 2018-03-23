package queue;
import person.Person;

public class Personq {

		private Person q[];
		private int size;
		private int front;
		private int rear;
		private int total;
		
		public Personq(int size){
			this.size = size;
			this.front = 0;
			this.rear = 0;
			this.total =0;
			q = new Person[this.size];
		}
		
		public boolean enQueue(Person item){
			
			if(isFull() == true) {
				System.out.println("Full");
				return false;
			} else {
				//System.out.println("en" + rear);
				q[rear] = item;
				rear = (rear+1) % size;
				//++rear;
				total++;
				//System.out.println("en-01" + rear + "  " + total + " item " + item);
				return true;
			}
		}
		
	    public Person deQueue(){
			
	    	Person item = q[front];
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
		
		
		//Print all users
		public void showAll() {
			int f = front;
			for (int i=0; i<total; i++) {
				System.out.println (q[f].printPerson());
				++f;
			}
		}
	}
