package data_structurePractice.list;


public class ArrayList {

	private int size = 0;
	
	Object[] elementData; 
	public ArrayList(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(int index, Object input) {
		for(int i = size-1;i>=index; i--) {
			elementData[i+1]=elementData[i];
		}
		elementData[index] = input;
		size++;
	}
	
	public void addFirst(Object element) {
		add(0,element);
	}
	
	public void addLast(Object element) {
		add(size,element);
	}
	
	public Object remove(int index) {
		Object returnData = elementData[index];
		for(int i = index+1; i<size;i++) {
			elementData[i-1] = elementData[i];
		}
		size--;
		elementData[size] = null;
		return returnData;
	}
	
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(size-1);
	}
	
	public String toString() {
		String str = "[";
		for(int i=0; i<size; i++) {
			str += elementData[i];
			str+=(i<size-1)? ",":"";
		}
		return str +="]";
	}
	
	public Object get(int index) {
		return elementData[index];
	}
	
	public int indexOf(Object input) {
		for(int i=0; i< size; i++) {
			if(input.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}

	public ListIterator iterator() {
		return new ListIterator();
	}
	public int size() {
		return size;
	}
	class ListIterator{
		int nextIndex = 0;
		public Object next() {
			return elementData[nextIndex++];
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		public Object previous() {
			return elementData[--nextIndex];
		}
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		public void add(Object element) {
			//elementData[nextIndex++]=element;
			ArrayList.this.add(nextIndex++, element);
		}
		public void remove() {
			ArrayList.this.remove(--nextIndex);
		}
	}

}
