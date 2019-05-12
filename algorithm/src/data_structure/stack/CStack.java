package data_structure.stack;

import data_structure.stack.GStack.EmptyGstackException;

public class CStack {

	private int ptr;
	private int max;
	Object[] stk;
	
		public CStack(int capacity) {
			ptr = -1;
			max = capacity;
			stk = new Object[max];
		}
		
		private boolean isEmpty() {
			return ptr <= -1? true:false;
		}
		private boolean isFull() {
			return ptr+1 >= max? true:false;
		}
		
		public void push(Object o) {
			if(!isFull()) {
			stk[++ptr] = o;
			}
		}
		
		public Object pop() {
			if(!isEmpty())
			 return stk[ptr--];
			return -1;
		}
		
		public Object peek(int ptr) {
			return stk[ptr];
		}
		public int indexOf(Object o) {
			for(int i = ptr-1; i>=0; i--)
				if(o.equals(stk[i]))
					return i;
			return -1;
		}
		
		public String toString() {
			String str = "[";
			for(int i = ptr; i>= 0; i--) {
				str += stk[i];
				str += (i > 0)?  ", " : "";
			}
			return str +="]";
		}
		
		public void clear() {
			ptr = -1;
		}
		
		public int capacity() {
			return max;
		}
		
		public int size() {
			return ptr+1;
		}
		
		
		public void dump() throws EmptyGstackException {
				if(!isEmpty()) {
					for(int i =0 ; i<= ptr; i++)
						System.out.println(stk[i]+" ");
					System.out.println();
				}
		}
}
