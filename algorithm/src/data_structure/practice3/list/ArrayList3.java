package data_structure.practice3.list;

import data_structure.practice2.list.ArrayList;

public class ArrayList3 {
	private int num;
	private int size;
	Object[] arrayList;

	public ArrayList3(int size) {
		this.size = size;
		this.num = 0;
		arrayList = new Object[size];
	}
	public class EmptyArrayListException extends RuntimeException {
	}
	public class OverflowArrayListException extends RuntimeException {
	}
	
	public void add(int index, Object x) {
		if(num>=size) throw new OverflowArrayListException();
		for(int i = num-1; i>=index; i--) {
			arrayList[i+1] = arrayList[i]; 
		}
		arrayList[index] = x;
		num++;
	}
	
	public void addFirst(Object x) {
		add(0,x);
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0; i< num; i++) {
			str += arrayList[i];
			str += (i < num-1)?  ", " : "";
		}
		return str +="]";
	}
	
	public Object remove(int index) {
		Object toBeRemoved = arrayList[index];
		return null;
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
			return arrayList[nextIndex++];
		}
		public boolean hasNext() {
			return nextIndex < size();
		}
		public Object previous() {
			return arrayList[--nextIndex];
		}
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		public void add(Object element) {
			//elementData[nextIndex++]=element;
			ArrayList3.this.add(nextIndex++, element);
		}
		public void remove() {
			ArrayList3.this.remove(--nextIndex);
		}
	}
}
