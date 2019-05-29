package data_structure.practice3.stack;

public class Stacktest {

	public static void main(String[] args) {
		Stack3 stk = new Stack3(5);
		
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		System.out.println(stk);
		stk.dump();
	}
	
}
