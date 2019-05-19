package data_structure.practice2.list;


public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	
	private class Node{
		private Object data;
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	public Node node(int index) {
		Node x = head;
		for(int i = 0; i<index ; i++) {
			x=x.next;
		}
		
		return x;
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; //처음엔 서로가 서로를 가리킴
		head = newNode; //처음엔 서로가 서로를 가리킴
		size++;
		if(size == 0)
			tail = head;
	}
	
	public void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1); // 새로 생성될 노드의 이전 노드
			Node temp2 = temp1.next; // 새로 생성될 노드의 다음 노드
		}
		
	}
	
	public void lastFirst(Object input) {
		if(size == 0) {
			addFirst(input);
		}
		Node newNode = new Node(input);
		newNode.next = tail;
		tail = newNode;
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
		Object returnData= temp.data;
		temp = null;
		size--;
		return returnData;
	}

	
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		} else {
			Node temp = node(k-1); //지우기 전의 노드
			Node toDoDeleted = temp.next; //지우기 전의 노드가 가리킴
			temp.next = temp.next.next;
			Object returnData= toDoDeleted.data;
			if(toDoDeleted == tail) tail = temp;
			toDoDeleted =null;
			size--;
			return returnData;
		}
	}
	public Object removeLast() {
		return remove(size-1); // 사이즈 -1 값 = 마지막의 인덱스 값
	}
	

}
