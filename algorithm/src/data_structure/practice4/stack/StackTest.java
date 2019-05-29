package data_structure.practice4.stack;

public class StackTest {

	public static void main(String[] args) {
		Stack4 stk = new Stack4(32);
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.pop();
		System.out.print(stk);
	}
}
