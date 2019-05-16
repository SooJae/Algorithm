package data_structurePractice.stack;

public class Stack {
	private Object[] stk;
	private int ptr;
	private int max;
	
	public class EmptyStackException extends RuntimeException{
	}
	
	public class OverflowStackException extends RuntimeException{
    }
	
	public Stack(int size){
		ptr = 0;
		max = size;
		stk = new Object[max];
	}
	
	
	
	public String toString() {
		String str = "[";
		for(int i = ptr-1; i>= 0; i--) {
			str += stk[i];
			str += (i > 0)?  ", " : "";
		}
		return str +="]";
	}

	public Object peek(int ptr) {
		return stk[ptr-1];
	}


	public void push(Object input) {
		if(ptr >= max) {
			throw new OverflowStackException();
		}
		stk[ptr++] = input;
	}
	
	public Object pop() {
		if(ptr<=0) {
			throw new EmptyStackException();
		}
		
		return stk[--ptr];
	}
	
	public int indexOf(Object x) {
		for(int i=ptr-1; i>=0;i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}
	
	public void clear() {
		ptr =0;
	}
	public int capacity() {
		return max;
	}
	public int size() {
		return ptr;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump(){
        if(ptr <= 0){
            System.out.println("스택이 비어있습니다.");
        }else{
            for(int i=0; i<ptr; i++){
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
