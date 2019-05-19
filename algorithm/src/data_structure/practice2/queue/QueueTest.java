package data_structure.practice2.queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue que = new Queue(6);
		
		que.enQueue(10);
		que.enQueue(20);
		que.enQueue(30);
		que.enQueue(40);
		que.deQueue();
		que.deQueue();
		que.deQueue();
		que.enQueue(60);
		System.out.println(que.search(60));
		//que.dump();
	}
}
