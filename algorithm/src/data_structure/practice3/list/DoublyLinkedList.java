package data_structure.practice3.list;

import data_structure.practice.list.DoublyLinkedList.ListIterator;

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
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		if(head!=null) {
			head.prev = null;
		}
		size--;
		return returnData;
	}
	
	public Object remove(int i) {
		Node temp = node(i-1);
		Node toDoDeleted = temp.next;
		temp.next = temp.next.next;
		if(temp.next != null) {
			temp.next.prev = temp;
		}
		Object returnData =toDoDeleted.data;
		if(toDoDeleted == tail) {
			tail = temp;
		}
		toDoDeleted = null;
		size--;
		return returnData;
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
			next =head;
			nextIndex =0;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		public Object previous() {
			if(next == null) {
				lastReturned = next = tail; //���� ���� �ִ� ��忡 lastReturned�� next�� ����Ų��.
			} else {
				lastReturned = next = next.prev;
			}
			nextIndex--;
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
				newNode.prev = lastReturned;
				if(next !=null) {
					newNode.next = next;
					next.prev = newNode;
				} else {
					tail = newNode;
				}
			}
			
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		
		public void remove() {
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			Node n = lastReturned.next;
			Node p = lastReturned.prev;
			
			if(p == null) {
				head = n ;
				head.prev = null;
				lastReturned =null;
			} else {
				p.next =next;
				lastReturned.prev = null;
			}
			if(n == null) {
				tail = p;
				//tail.next= null; ??
			} else {
				n.prev = p;
			}
			if(next == null) {
				lastReturned = tail;
			} else {
				lastReturned = next.prev;
			}
			size--;
			nextIndex--;
		}
		
	}
}
