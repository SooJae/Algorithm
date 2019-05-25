package data_structure.practice3.hashtable;

public class Test {
	public static void main(String[] args) {
		HashTable h = new HashTable(5);
		h.put("n2n", "is good");
		h.put("jqae", "is god");
		h.put("oosu", "has a wa2llet");
		h.put("man", "su ja2e");
		System.out.println(h.get("oosu"));
		System.out.println(h.get("man"));
		System.out.println(h.get("su"));
		System.out.println(h.get("so"));
	}
}
