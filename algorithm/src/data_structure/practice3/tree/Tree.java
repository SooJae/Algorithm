package data_structure.practice3.tree;

public class Tree {

	private Node root;
	
	public void setRoot(Node node ) {
		this.root = node;
	}
	
	public Node getRoot() {
		return root;
	}
	
	public Node makeNode(Node left, Object data, Node right) {
		Node node = new Node();
		node.data = data;
		node.left = left;
		node.right = right;
		return node;
	}
	
	public void inOrder(Node node) {
		if(node!=null) {
			inOrder(node.left);
			System.out.println(node.data);
			inOrder(node.right);
		}
	}
	
	public void preOrder(Node node) {
		if(node!=null) {
			System.out.println(node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
	}
	public void postOrder(Node node) {
		if(node!=null) {
			preOrder(node.left);
			preOrder(node.right);
			System.out.println(node.data);
		}
	}
}
