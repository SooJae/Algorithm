package data_structure.practice3.list;

public class ListTest {
	public static void main(String[] args) {
//		ArrayList3 al = new ArrayList3(32);
		LinkedList3 ll = new LinkedList3();
//		al.addFirst(0);
//		al.add(1, 2);
//		al.addFirst(-1);
//		ArrayList3.ListIterator li = al.iterator();

		//ll.addFirst(10);
		//ll.addFirst(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.remove(3);
		System.out.println(ll);
		
	}
	
}
