package data_structure.practice4.stack;

public class Stack4 {
//
	private int ptr;
	private int size;
	private Object[] stk;

	public Stack4(int size) {
		this.ptr = 0;
		this.size = size;
		stk = new Object[size];
	}

	public class OverflowStackException extends RuntimeException {
	}

	public class EmptyStackException extends RuntimeException {
	}

	public void push(Object o) {
		if (size <= ptr)
			throw new OverflowStackException();
		stk[ptr++] = o;
	}

	public Object pop() {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[--ptr];
	}

	public String toString() {
		String str = "[";
		for (int i = ptr - 1; i >= 0; i--) {
			str += stk[i];
			str += (i > 0) ? ", " : "";
		}
		return str += "]";
	}

	public Object peek() {
		if (ptr <= 0)
			throw new EmptyStackException();
		return stk[ptr - 1];
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
		if (ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		}
		for (int i = 0; i < ptr; i++) {
			System.out.print(stk[i] + " ");
		}
		System.out.println();
	}
}
