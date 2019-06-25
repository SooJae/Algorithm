package algorithm.practice10.datastructure.qs;

public class Queue10 {
	private int front, rear;
	private int num;
	private int size;
	private Object[] que;
	
	public Queue10(int size) {
		this.size = size;
		this.front = this.rear = this.num = 0;
		que = new Object[size];
	}
	
	public static class OverflowQueueException extends RuntimeException{
	}
	public static class EmptyQueueException extends RuntimeException{
	}

	public void enqueue(Object o) {
		if(num == size) throw new OverflowQueueException();
		que[rear++] = o;  
		num++;
		
		if(rear == size) rear=0;
		
	}

	public Object dequeue() {
		if(num <= 0) throw new EmptyQueueException();
		Object returnData= que[front++];
		num--;
		if(front == size) front =0;
		return returnData;
	}
	
	public Object peekqueue() {
		if(num <= 0) throw new EmptyQueueException();
		return que[front];
	}
	
	public void dump() {
		if(num<=0) System.out.println("큐가 비어있습니다.");
		for(int i = 0; i<num; i++) {
			System.out.print(que[(i+front)%size] + " ");
			
		}
	}
	
	public void clear() {
		num= front = rear = 0;
	}
	
	public int search(Object o) {
		for(int i = 0; i< num; i++) {
			if(que[(i+front)%size].equals(o)) return i;
		}
		return -1;
	}
	
	public int capacity() {
		return size;
	}
	
	public int size() {
		return num;
	}

}
