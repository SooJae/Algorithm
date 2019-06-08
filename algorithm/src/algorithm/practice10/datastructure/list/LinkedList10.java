package algorithm.practice10.datastructure.list;

import data_structure.practice3.list.LinkedList3;

public class LinkedList10 {

	private int size = 0;
	private Node10 head;
	private Node10 tail;
	
	
	private class Node10{
		private Object data;
		private Node10 next;
		
		public Node10(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public Node10 node(int index) {
		Node10 x = head;
		for(int i = 0; i<index; i++) {
			 x = x.next;
		}
		return x;
	}
	
	public void addFirst(Object o) {
		Node10 newNode = new Node10(o);
		newNode.next = head;
		head = newNode;
		size++;
		if(head.next==null) tail=head;
	}
	
	public void add(int index, Object o ) {
		if(index == 0) addFirst(o);
		else {
			Node10 temp1 = node(index-1); // 추가하려는 노드의 전노드
			Node10 temp2 = temp1.next; // 추가하려는 노드의 다음노드
			Node10 newNode = new Node10(o);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if(newNode.next == null) tail = newNode;
		}
	}
	
	public void addLast(Object o) {
		if(size == 0) {
			addFirst(o);
		} else {
			Node10 newNode = new Node10(o);
			tail.next = newNode;
			tail = newNode;
			size++;
		}
		
	}
	
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node10 temp = head;
		String str="[";
		
		while(temp.next !=null) {
			str += temp.data+", ";
			temp = temp.next;
		}
		str+=temp.data;
		return str+"]";
	}
	
	public Object removeFirst() {
		Node10 temp = head;
		head = head.next;
		Object returnData =temp.data;
		temp = null;
		size--;
		
		return returnData;
	}
	
	public Object remove(int index) {
		if(index == 0) return removeFirst();
		else {
			Node10 temp = node(index-1);
			Node10 toDoDeleted = temp.next;
			temp.next = temp.next.next;
			Object returnData = toDoDeleted.data;
			
			if(toDoDeleted ==tail) tail = temp;
			
			toDoDeleted = null;
			size--;
			return returnData;
		}
	}

	public Object removeLast() {
		return remove(size-1);
	}
	
	public int size() {
		return size;
	}

	public Object get(int index) {
		Node10 temp = node(index);
		return temp.data;
	}
	
	public int indexOf(Object o) {
		Node10 temp = head;
		for(int i=0; i<size; i++ ) {
			if(temp.data.equals(o)) return i;
			temp = temp.next;
		}
		return -1;
	}
	
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	public class ListIterator {
		
		private Node10 next;
		private Node10 lastReturned;
		private int nextIndex;
		
		public ListIterator() {
			next = head;
			nextIndex = 0;
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
		
		public void add(Object o) {
			Node10 newNode = new Node10(o);
			
			if(lastReturned == null) { //노드가 없다면
				head=newNode;
				newNode.next = next; //새로만들어진 노드의 next를 현재 가리키고 있는 next로 지정
			} else {
				lastReturned.next = newNode;
				newNode.next = next; //새로만들어진 노드의 next를 현재 가리키고 있는 next로 지정
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}
		
		public void remove() {
			if(nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList10.this.remove(nextIndex-1); // 이렇게 하면 for문을 2번 돌기 때문에 비효율적
			nextIndex--;
		}
	}
}
