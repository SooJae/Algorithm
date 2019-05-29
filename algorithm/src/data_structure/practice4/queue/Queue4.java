package data_structure.practice4.queue;

public class Queue4 {

	private int front ,rear;
	private int size;
	private int num;
	private Object[] queue;
	
	public Queue4(int size) {
		this.rear = this.front = 0;
		this.num =0;
		this.size = size;
		
		queue = new Object[size];
	}
	
	public class EmptyQueueException extends RuntimeException{
	}

	public class OverflowQueueException extends RuntimeException{
	}
	
	public void enQueue(Object o) {
		if(num>=size) throw new OverflowQueueException();
		queue[rear++] = o;
		num++;
		
		if(num == size) rear =0;
	}
	
	public Object deQueue() {
		if(num <= size) throw new EmptyQueueException();
		Object returnData = queue[front++];
		num--;
		if(front == size) front =0;
		return returnData;
	}
	
	public Object peekQueue() {
		if(num <= size) throw new EmptyQueueException();
		return queue[front];
	}
	
	public void dump() {
		if(num<=0) System.out.println("큐가 비어있습니다.");
		else {
			for(int i = 0; i<num; i++) {
				System.out.print(queue[(i+front)%size]+" ");
			}
		}
	}
	
	public int search(Object x) {
		if(num<=0) throw new EmptyQueueException();
		
		for(int i = 0; i<num; i++) {
			if(queue[(i+front)%size].equals(x))
				return i;
		}
		return -1;
	}
	
	
}
