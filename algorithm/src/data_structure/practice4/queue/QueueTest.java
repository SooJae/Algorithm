package data_structure.practice4.queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue4 queue = new Queue4(16);
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(30);
		queue.clear();
		queue.dump();
	}
}
