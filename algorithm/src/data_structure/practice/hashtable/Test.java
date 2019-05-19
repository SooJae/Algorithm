package data_structure.practice.hashtable;

import java.util.LinkedList;

class HashTable{
	class Node{
		String key;
		String value;
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		String value() {
			return value;
		}
		void value(String value) {
			this.value = value;
		}
	}
	
	LinkedList<Node>[] data;
	
	public HashTable(int size) {
		this.data = new LinkedList[size];
	}
	int getHashCode(String key) {
		int hashcode = 0;
		for(char c : key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}
	
	int convertToIndex (int hashcode) {
		return hashcode % data.length;
	}
	Node searchKey(LinkedList<Node> list, String key) {
		if(list ==null) return null;
		for(Node node : list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}
	void put(String key, String value) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		System.out.println(key + ", hashcode("+ hashcode +"), index("+index+")");
		LinkedList<Node> list = data[index];
		
		if(list == null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		Node node =searchKey(list,key);
		if(node == null) {
			list.addLast(new Node(key, value));
		} else {
			node.value(value);
		}
	}
	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node ==null? "Not found" : node.value();
	}
	
}
public class Test {
	public static void main(String[] args) {
		HashTable h = new HashTable(5);
		h.put("n2n", "is good");
		h.put("jqae", "is god");
		h.put("oosu", "has a wa2llet");
		h.put("man", "su ja2e");
		System.out.println(h.get("soo"));
		System.out.println(h.get("jae"));
		System.out.println(h.get("su"));
		System.out.println(h.get("so"));
	}
}
