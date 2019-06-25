package algorithm.practice11.datastructure.qs;

public class Queue11 {
	int front , rear;
	int size;
	int num;
	Object[] que;
	
	
	public Queue11(int size) {
		this.front = this.rear = this.num = 0;
		this.size = size;
		que = new Object[size];
	}
	
	public static class OverflowException extends RuntimeException {
	}
	public static class EmptyException extends RuntimeException {
	}
	public void enqueue(Object o) {
		if(num>=size) throw new OverflowException();
		que[rear++] = o;
		num++;
		
		if(rear == size) rear = 0;
	}
	
	public Object dequeue() {
		if(num<=0) throw new EmptyException();
		Object returnData = que[front++];
		num--;
		if(front == size) front =0;
		return returnData;
	}
	
	

}
