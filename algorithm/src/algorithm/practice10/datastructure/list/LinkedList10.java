package algorithm.practice10.datastructure.list;

public class LinkedList10 {

	private int num = 0;
	private Node10 head;
	private Node10 tail;
	
	
	private class Node10{
		private Object data;
		private Node10 next;
		
		public Node10(Object input) {
			this.data = input;
			this.next = null;
		}
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	

}
