package algorithm.practice10.datastructure.list;

public class Test10 {

	public static void main(String[] args) {
		ArrayList10 al = new ArrayList10(4);
		LinkedList10 ll = new LinkedList10();
		DoublyLinkedList10 dl = new DoublyLinkedList10();
//		al.addFirst(10);
//		al.addFirst(20);
//		al.addFirst(30);
//		al.addLast(40);
//		al.add(2,50);
//		al.removeLast();

//		ArrayList10.ListIterator li = al.listIterator();
//		while(li.hasNext()) {
//			int number = (int) li.next();
//			if(number == 20) {
//				li.remove();
//			}
//		}
//		LinkedList10.ListIterator lli =  ll.listIterator();
//		ll.addLast(0);
//		ll.addLast(10);
//		ll.addLast(20);
//		ll.addLast(30);
//		ll.addLast(40);
		
		DoublyLinkedList10.ListIterator dll = dl.listIterator();
		
		dl.addFirst(10);
		dl.addFirst(20);
		dl.addFirst(30);
		System.out.println(dl.node(2));
	}
	
}
