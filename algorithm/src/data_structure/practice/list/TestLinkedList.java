package data_structure.practice.list;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(20);
		numbers.addLast(10);
		numbers.addLast(0);
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
