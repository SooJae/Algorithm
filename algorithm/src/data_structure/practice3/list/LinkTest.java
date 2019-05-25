package data_structure.practice3.list;

public class LinkTest {
	public static void main(String[] args) {
		ArrayList3 al = new ArrayList3(32);
		al.addFirst(0);
		al.add(1, 2);
		al.addFirst(-1);
		
		System.out.println(al);
	}
	
}
