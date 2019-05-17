package data_structurePractice.list;

public class Test {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(32);
		
//		al.add(0, 10);
//		al.addFirst(-50);
//		al.addLast(60);
//		
//		
//		ArrayList.ListIterator li	= al.iterator();
//		while(li.hasNext()) {
//			Object number = li.next();
//			if(number.equals(10)) {
//				li.remove();
//			}
//		}
//		System.out.println(al);
		
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		ll.addFirst(40);
		System.out.println(ll);
	}
}
