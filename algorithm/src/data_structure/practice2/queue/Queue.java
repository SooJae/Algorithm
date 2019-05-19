package data_structure.practice2.queue;

public class Queue {
	private int front;
	private int rear;
	private int max;
	private int num;
	private Object[] que;
	
	public class EmptyStackException extends RuntimeException{
	}
	
	public class OverflowStackException extends RuntimeException{
    }
	
	public Queue(int capacity) {
		front= rear= num = 0;
		max = capacity; 
		que = new Object[max];
	}
	
	public void enQueue(Object x) throws OverflowStackException{
		if(num>=max) throw new OverflowStackException();
		
		System.out.println("rear값 : "+rear);
		num++;
		que[rear++] = x;
		
		if(rear == max)
			rear =0;
	}
	
	public Object deQueue() throws EmptyStackException{
		if(num<=0) throw new EmptyStackException();
		
		System.out.println("front값 : "+front);
		Object returnData = que[front++];
		num--;
		if(front == max) front =0;
		return returnData;
	}
	
	public Object peekQueue() throws EmptyStackException{
		if(num<=0) throw new EmptyStackException();
		return que[front];
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0; i < num; i++) {
			str+= que[i];
			str += (i < num-1)?  ", " : "";
		}
		return str+="]";
	}
	
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i=0; i< num; i++) {
				System.out.print(que[(i+front)% max]+ " ");
			}
			System.out.println();
		}
	}
	
	int search(int x) throws EmptyStackException{
		if(num<=0)
			throw new EmptyStackException();
		
		for(int i =0; i< num ; i++) {
			if(que[(i+front)%max].equals(x))
				return i;
		}
		return -1;
	}
}
