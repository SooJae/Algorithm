package algorithm.practice11.datastructure.qs;

import algorithm.practice10.datastructure.qs.Stack10.EmptyException;
import algorithm.practice10.datastructure.qs.Stack10.OverflowException;

public class Stack11 {

	int ptr;
	int size;
	Object[] stk;
	public Stack11(int size) {
		this.size = size;
		this.ptr = 0;
		stk = new Object[size];
	}
	public static class OverflowException extends RuntimeException {
	}
	public static class EmptyException extends RuntimeException {
	}
	
	public void push(Object o) {
		if(ptr >= size) throw new OverflowException(); 
		stk[ptr++] = o;
	}
	public Object pop() {
		if(ptr<=0) throw new EmptyException();
		return stk[--ptr];
	}
	
	public Object peek() {
		if(ptr<=0) throw new EmptyException();
		return stk[ptr-1];
	}
	public int search(Object o) {
		for (int i = ptr - 1; i >= 0; i--) {
			if (stk[i] == (o)) {
				return ptr - i;
			}
		}
		return -1;
	}
	public void clear() {
		ptr = 0;
	}
	
	public int size() {
		return ptr;
	}
	public int capacity() {
		return size;
	}
	
	public void dump() {
		for(int i = 0; i<ptr; i++) {
			System.out.print(stk[i] + " ");
		}
		System.out.println();
		
	}
	

}
