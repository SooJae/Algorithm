package data_structure.practice.queue;

public class CircleQueue {

	private int front;
	private int rear;
	private int maxSize;
	private int num;
	private Object[] queueCircle;
	
	public CircleQueue(int maxSize) {
		this.front =0;
		this.rear =0;
		this.maxSize = maxSize;
		this.queueCircle = new Object[maxSize];
	}
	
	public boolean empty() {
		return (num <= 0);
	}
	public boolean full() {
		return (num >= maxSize);
	}
	
	public Object enque(Object o) {
		if(full()) throw new ArrayIndexOutOfBoundsException();
		num++;
		queueCircle[rear++]= o;
		
		if(rear==maxSize)
			rear = 0;
		
		return o;
	}
	public Object deque() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		Object x = queueCircle[front++];
		num--;
		
		if(front==maxSize)
			front = 0;
		
		return x;
		
	}
	
	public Object peek() {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		return queueCircle[front];
	}
	
	public int indexOf(Object o) {
		for(int i =0; i<num; i++) {
			int idx = (i+front) % maxSize;
			if(queueCircle[idx].equals(o))
				return idx;
		}
		return -1;
	}
	
	public void dump() {
		if(num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i=0; i< num; i++)
				System.out.println(queueCircle[(i+front)% maxSize]+ " ");
			System.out.println();
		}
	}
	
	int search(int x) {
		if(empty()) throw new ArrayIndexOutOfBoundsException();
		
		for(int i =0; i< num ; i++) {

			if(queueCircle[(i+front) % maxSize].equals(x))
				return i+1;
		}
		return 0;
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
