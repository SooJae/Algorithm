package data_structure.queue;


public class Main {
	public static void main(String[] args) {
		CircleQueue q = new CircleQueue(5);
		
		q.enque(6);
		q.enque(7);
		q.enque(10);
		q.enque(10);
		q.enque(10);
		System.out.println(q.indexOf(10));
		System.out.println(q.indexOf(10));
	}
}
