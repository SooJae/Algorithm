package algorithm.practice10.datastructure.list;

import data_structure.practice.list.ArrayList;

public class ArrayList10 {


	private int num,size;
	private Object[] arrayList;
	public ArrayList10(int size) {
		this.num = 0;
		this.size = size;
		arrayList = new Object[size];
	}

	
	public static class OverflowArrayListException extends RuntimeException{
	}
	public static class EmptyArrayListException extends RuntimeException{
	}
	public void add(int index , Object o) {
		if(num >= size) throw new OverflowArrayListException();
		
		for(int i = num-1; i>=index; i--) {
			arrayList[i+1] = arrayList[i];
		}
		arrayList[index] = o;
		num++;
	}
	public void addFirst(Object o) {
		add(0, o);
	}
	public void addLast(Object o ) {
		add(num, o);
	}
	
	public String toString() {
		String str = "[";
		for(int i = 0; i< num; i++) {
			str += arrayList[i];
			str += (i < num-1)?  "," : "";
		}
		return str +="]";
	}
	public Object remove(int index) {
		Object toBeDeleted = arrayList[index];
		for(int i =index+1; i<num; i++) {
			arrayList[i-1]=arrayList[i];
		}
		num--;
		arrayList[num] = null;
		return toBeDeleted;
	}
	public Object removeFirst() {
		return remove(0);
	}
	public Object removeLast() {
		return remove(num-1);
	}
	
	public Object get(int index) {
		return arrayList[index];
	}
	
	public int size() {
		return num;
	}
	public int indexOf(Object o) {
		for(int i = 0; i<num; i++) {
			if(o.equals(arrayList[i])) return i;
		}
		return -1;
	}

	public class ListIterator {
		private int nextIndex = 0;
		
		public Object next() {
			return arrayList[nextIndex++];
		}
		public boolean hasNext() {
			return nextIndex <size();
		}
		public Object previous() {
			return arrayList[--nextIndex];
		}
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		
		public void add(Object o) {
			//elementData[nextIndex++]=element;
			ArrayList10.this.add(nextIndex++, o);
		}
		public Object remove() {
			return ArrayList10.this.remove(--nextIndex);
		} 

	}
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
}
