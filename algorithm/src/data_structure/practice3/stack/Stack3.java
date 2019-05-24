package data_structure.practice3.stack;

public class Stack3 {

	private int ptr;
	private int maxSize;
	private Object[] stk;
	
	public Stack3(int size) {
		ptr = 0;
		this.maxSize = size;
		stk = new Object[size];
	}
	
	public class EmptyStackException extends RuntimeException{
	}
	public class OverFlowStackException extends RuntimeException{
	}
	
	public void push(Object x)  {
		if(maxSize <= ptr) throw new OverFlowStackException();
		stk[ptr++] = x;
	}
	public Object pop() {
		if(ptr<=0) throw new EmptyStackException();
		return stk[--ptr];
	}
	
	public Object peek() {
		if(ptr<=0) throw new EmptyStackException();
		return stk[ptr-1];
	}
	public String toString() {
		String str = "[";
		for(int i =ptr-1; i>=0; i--) {
			str+=stk[i];
			str+=(i>0)? ", ": "";
		}
		return str+="]";
	}
	
	public int search(Object x) {
		for(int i = ptr-1; i>=0; i--) {
			if(stk[i]==(x)) {
				return ptr-i;
			}
		}
		return -1;
	}
	
	public void clear() {
		ptr =0;
	}
	public int size() {
		return ptr;
	}
	public int capacity() {
		return maxSize;
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
