package data_structure.stack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CStack s = new CStack(64);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.peek(3));
		
	}
}
