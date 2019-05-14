package data_structure.list;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		
		
		
//		for(int i = 0; i<numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		ArrayList.ListIterator li = numbers.listIterator();
		while(li.hasNext()) {
			int number = (int) li.next();
			if(number == 30) {
				li.remove();
			}
		}
		System.out.println(numbers);
	}
}
