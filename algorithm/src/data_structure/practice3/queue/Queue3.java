package data_structure.practice3.queue;

public class Queue3 {
	
	private int rear,front;
	private int maxSize;
	private int num;
	private Object[] queue;
	
	public Queue3(int size) {
		this.rear = this.front =0;
		this.maxSize = size;
		queue = new Object[size];
	}
	
	public class EmptyQueueException extends RuntimeException{
	}

	public class OverflowQueueException extends RuntimeException{
	}
	
	public String toString() {
		String str="[";
		for(int i =0; i<num; i++) {
			str+=queue[i];
			str+=(i<num-1)?", ":"";
		}
		return str+="]";
	}


	public void enQueue(Object x) {
		if(num>=maxSize) throw new OverflowQueueException();
		queue[rear++] = x;
		num++;
		
		if(rear == maxSize) rear = 0;
	}
	
	public Object deQueue() {
		if(num<=0) throw new EmptyQueueException();
		Object returnData = queue[front++];
		num--;
		if(front == maxSize) front =0;
		
		return returnData;
	}
	
	public Object peekQueue() {
		if(num<=0) throw new EmptyQueueException();
		return queue[front];
	}
	
	public void dump() {
		if(num<=0)
			System.out.println("큐가 비어있습니다.");
		else {
			for(int i=0; i<num ; i++) {
				System.out.print(queue[(i+front)%maxSize]+" ");
			}
		}
	}
	public int search(Object x) {
		if(num<=0) throw new EmptyQueueException();
		
		for(int i =0 ; i<num; i++) {
			if(queue[(i+front)%maxSize].equals(x))
				return i;
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear =0;
	}
	
	public int capacity() {
		return maxSize;
	}
	
	public int size() {
		return num;
	}

	
}
