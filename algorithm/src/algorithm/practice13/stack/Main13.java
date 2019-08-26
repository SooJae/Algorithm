package algorithm.practice13.stack;

public class Main13 {

	public static void main(String[] args) {
		Stack13 stk = new Stack13(5);
		stk.push("a");
		stk.push("b");
		stk.push("c");
		stk.push("d");
		stk.push("e");
		System.out.println(stk.size());
	}
}
