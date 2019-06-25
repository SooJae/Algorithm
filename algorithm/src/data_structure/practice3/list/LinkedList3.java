package data_structure.practice3.list;


public class LinkedList3 {

	private Node head;
	private Node tail;
	private int size =0;
	
	private class Node{
		private Object data;
		private Node next;
		
		public Node(Object o) {
			this.data=o;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	public Node node(int index) {
		Node x= head;
		for(int i=0; i<index; i++) {
			x=x.next;
		}
		return x;
	}
	
	public void addFirst(Object o) {
		Node newNode = new Node(o);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next == null) tail = head;
	}
	
	public void addLast(Object o) {
		if(size == 0) {
			addFirst(o);
		} else {
			Node newNode = new Node(o);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}
	public void add(int index, Object o) {
		if(index ==0 ) addFirst(o);
		else {
			Node temp1 = node(index-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(o);
			temp1.next = newNode;
			newNode = temp2;
			size++;
			
			if(newNode.next == null) {
				tail= newNode;
			}
		}
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str="[";
		
		while(temp.next !=null) {
			str += temp.data+", ";
			temp = temp.next;
		}
		str+=temp.data;
		return str+"]";
	}
	
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		
		return returnData;
	}
	
	public Object remove(int index) {

		if(index == 0) return removeFirst();
		else {
			Node temp = node(index-1);
			Node toDoDeleted = temp.next;
			temp.next = temp.next.next;
			Object returnData = toDoDeleted.data;
			if(toDoDeleted == tail) {
				tail = temp;
			}
			toDoDeleted = null;
			size--;
			return returnData;
		}
	}
	

	public Object removeLast() {
		return remove(size-1); // ������ -1 �� = �������� �ε��� ��
	}

	public int size() {
		return size;
	}

	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}

	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp= temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	public class ListIterator{

		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		public ListIterator(){
			next = head;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		public void add(Object input) {
			Node newNode = new Node(input);
			
			if(lastReturned == null) { // ��尡 ���ٸ�
				head = newNode;
				newNode.next = next; //���θ������ ����� next�� ���� ����Ű�� �ִ� next�� ����
			} else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			
			
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		public void remove() {
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList3.this.remove(nextIndex-1); // �̷��� �ϸ� for���� 2�� ���� ������ ��ȿ����
			nextIndex--;
		}
	}
	
}
