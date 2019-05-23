package data_structure.practice3.queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue3 queue = new Queue3(32);
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.dump();
	}
}
