package queue;
import person.Person;

public class QueueMain {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		QueueClass  q = new QueueClass(5);
//		q.enQueue(3);
//		q.enQueue(5);
//		q.enQueue(6);
//		q.enQueue(7);
//		q.enQueue(8);
//		q.enQueue(9);
//		
//		System.out.println("one " + q.deQueue());
//		
//		q.showAll();
//		
////		System.out.println(q.deQueue());
////		System.out.println(q.deQueue());
////		System.out.println(q.deQueue());
////		System.out.println(q.deQueue());
////		System.out.println(q.deQueue());
		//Test 
		Personq q = new Personq(5);
		q.enQueue(new Person ("11 ", "Siby " ));
		q.enQueue(new Person ("12 ", "Riona " ));
		q.enQueue(new Person ("13 ", "Rani " ));
		q.showAll();
		
		//Made some changes
		
	}

}
