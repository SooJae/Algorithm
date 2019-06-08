package algorithm.practice10.datastructure.list;


public class DoublyLinkedList10 {
	

	private Node10 head;
	private Node10 tail;
	private int size =0;
	
	private class Node10 {
		private Object data;
		private Node10 next;
		private Node10 prev;
		
		public Node10(Object o) {
			this.data = o;
			this.next = this.prev = null;
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object o) {
		Node10 newNode = new Node10(o);
		newNode.next = head;
		if(head != null) head.prev = newNode;
		
		head = newNode;
		size++;
		
		if(head.next == null) tail = newNode;
	}

	public void addLast(Object o) {
		Node10 newNode = new Node10(o);
		
		if(size == 0) addFirst(o);
		else {
			tail.next = newNode;//tail.next�� ������带 ����Ŵ ��(tail)->��
			newNode.prev = tail; // newNode�� ������ tail�� ����Ű�� ��带 ����Ų��. ��(tail)<->��
			tail = newNode; //tail��  ���ο� ��带 ���� ����Ŵ ��<->��(tail)
		}
	}
	
	public Node10 node(int index) {
		int mid = size/2;
		if(index<mid) {
			Node10 x = head;
			for(int i = 0; i<index; i++) {
				x=x.next;
			}
			return x;
		} else {
			Node10 x = tail;
			for(int i = size-1; i>index;i--) {
				x=x.prev;
			}
			return x;
		}
	}
	
	public void add(int index, Object o) {
		if(index == 0) addFirst(o);
		else {
			Node10 temp1 = node(index-1);
			Node10 temp2 = temp1.next;
			Node10 newNode = new Node10(o);
			
			temp1.next = newNode;
			newNode.next = temp2;
			
			if(temp2 != null) temp2.prev = newNode;
	
			newNode.prev = temp1;
			size++;
			if(newNode.next ==null) tail = newNode;
		}
	}
	
	public String toString() {
		if(head == null) return "[]";
		
		Node10 temp = head;
		String str="[";
		while(temp.next!=null) {
			str += temp.data+", ";
			temp = temp.next;
		}
		str += temp.data;
		return str+="]";
	}
	
	public Object removeFirst() {
		Node10 temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		
		if(head!=null) head.prev = null;
		
		size--;
		return returnData;
	}
	
	public Object remove(int index) {
		if(index == 0) return removeFirst();
		else {
			Node10 temp = node(index-1);
			Node10 toDoDeleted = temp.next;
			temp.next = temp.next.next;
			if(temp.next != null) {
				temp.next.prev = temp;
			}
			
			Object returnData = toDoDeleted.data;
			if(toDoDeleted == tail) tail = temp;
			
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
			Node10 newNode = new Node10(input);
			
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
			Node10 n = lastReturned.next;
			Node10 p = lastReturned.prev;
			
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
