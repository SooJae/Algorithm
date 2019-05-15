package data_structure.list;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.addFirst(0);
		LinkedList.ListIterator i = numbers.listIterator();
		
		i.add(5);
		while(i.hasNext()) {
			if((int)i.next() == 20) {
				i.remove();
			}
		}
		System.out.println(numbers);
	}
}
