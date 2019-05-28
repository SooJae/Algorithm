package data_structure.practice3.list;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size = 0;
	

	public class Node{
		private Object data;
		private Node prev;
		private Node next;
		
		public Node(Object input) {
			this.data = input;
			this.prev = null;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object o) {
		Node newNode = new Node(o);
		newNode.next = head;

		if(head != null) head.prev = newNode; //��尡 �ϳ��� ������
		
		head = newNode;
		size++;
		
		if(head.next ==null) tail = newNode;
	}
	
	public void addLast(Object o) {
		Node newNode = new Node(o);
		if(size == 0) {
			addFirst(o);
		} else {
			tail.next = newNode; //tail.next�� ������带 ����Ŵ ��(tail)->��
			newNode.prev = tail; // newNode�� ������ tail�� ����Ű�� ��带 ����Ų��. ��(tail)<->��
			tail = newNode; //tail��  ���ο� ��带 ���� ����Ŵ ��<->��(tail)
			size++;
		}
	}
	
	public Node node(int index) {
		if(index<size/2) {
			Node x = head; //head�� ����Ű�� ��带 x��� �Ѵ�.
			for(int i=0; i<index; i++) {
				x=x.next;
			}
			return x;
		} else {
			Node x= tail;
			for(int i=size-1;i>index; i-- ) {
				x=x.prev;
			}
			return x;
		}
	}
	
	public void add(int index, Object o) {
		if(index == 0) {
			addFirst(o);
		}else {
			Node temp1 = node(index -1);
			Node temp2 = temp1.next;
			Node newNode = new Node(o);
			
			temp1.next = newNode;
			newNode.next = temp2;
			
			if(temp2!=null) {
				temp2.prev = newNode;
			}
			
			newNode.prev = temp1;
			size++;
			
			if(newNode.next==null) {
				tail = newNode;
			}
		}
	}
	
	public String toString() {
		if(head==null) return "[]";
		
		Node temp = head;
		String str="[";
		
		while(temp.next !=null) {
			str += temp.data+", ";
			temp = temp.next;
		}
		
		str+=temp.data;
		return str+="]";
	}
	
	public Object removeFirst() {
		
	}
}
