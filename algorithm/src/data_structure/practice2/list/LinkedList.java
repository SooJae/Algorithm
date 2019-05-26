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
		newNode.next = head; //ó���� ���ΰ� ���θ� ����Ŵ
		head = newNode; //ó���� ���ΰ� ���θ� ����Ŵ
		size++;
		if(size == 0)
			tail = head;
	}
	
	public void add(int k, Object input) {
		if(k==0) {
			addFirst(input);
		} else {
			Node temp1 = node(k-1); // ���� ������ ����� ���� ���
			Node temp2 = temp1.next; // ���� ������ ����� ���� ���
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
			Node temp = node(k-1); //����� ���� ���
			Node toDoDeleted = temp.next; //����� ���� ��尡 ����Ŵ
			temp.next = temp.next.next;
			Object returnData= toDoDeleted.data;
			if(toDoDeleted == tail) tail = temp;
			toDoDeleted =null;
			size--;
			return returnData;
		}
	}
	public Object removeLast() {
		return remove(size-1); // ������ -1 �� = �������� �ε��� ��
	}
	
	
	
	
	

}
