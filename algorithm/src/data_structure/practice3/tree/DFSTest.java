//package data_structure.practice3.tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//class Graph{
//	class Node{
//		int data;
//		LinkedList<Node> adjacent; // ������ ��尡 �����̳ĸ� ������
//		boolean marked; //�湮 �ߴ����� ��ŷ�ϴ� �÷��� 
//		public Node(int data){
//			this.data = data;
//			this.marked = false;
//			adjacent = new LinkedList<Node>();
//		}
//	}
//	Node[] nodes; //��带 ������ �迭
//	
//	public Graph(int size) {
//		nodes = new Node[size];
//		for(int i = 0; i<size; i++) {
//			nodes[i] = new Node(i); // ���Ǹ� ���ؼ� ������ �迭�� ��ȣ�� ������
//		}
//	}
//	//�� ����� ���踦 �����ϴ� �Լ� addEdge
//	void addEdge(int i1, int i2) {
//		Node n1 = nodes[i1]; // �����Ͱ� �ε����� �����Ƿ� ���ڰ��� �ε����� ����� �� �ִ�.
//		Node n2 = nodes[i2]; // �����Ͱ� �ε����� �����Ƿ� ���ڰ��� �ε����� ����� �� �ִ�.
//		if(!n1.adjacent.contains(n2)) {
//			n1.adjacent.add(n2); // �ΰ��� ����� ������ ��带 �����ϴ� linkedList��  ������ �ִ��� Ȯ���ϰ� ������ ���� �߰��� ���ش�.
//		}
//		if(!n2.adjacent.contains(n1)) {
//			n2.adjacent.add(n1); // �ΰ��� ����� ������ ��带 �����ϴ� linkedList��  ������ �ִ��� Ȯ���ϰ� ������ ���� �߰��� ���ش�.
//		}
//	}
//	void dfs() {
//		dfs(0); // dfs�Լ��� �׳� ȣ���ϸ� 0������ ����
//	}
//	void dfs(int index) {
//		Node root = nodes[index];// �ش��ε����� ��带 ������ ��
//		Stack<Node> stack = new Stack<Node>(); // ���ÿ� �����Ѵ�.
//		stack.push(root); 
//		root.marked = true ; // �׸��� ���ÿ� ���ٰ� ��ŷ�Ѵ�.
//		
//		while(!stack.isEmpty()) { // ���ÿ� �����Ͱ� ���������� 
//			Node r = stack.pop(); // ���ÿ��� ������ �ϳ��� ��������
//			for(Node n : r.adjacent) { //������ ����� �ڽĵ��� ���ÿ� �߰��Ѵ�.
//				if(n.marked == false) { // �̶� ���ÿ� �߰����� ���� ���鸸 �߰��Ѵ�.
//					n.marked = true;
//					stack.push(n);
//				}
//			}
//			visit(r);// �湮 ����Լ�
//		}
//	}
//	void bfs() {
//		bfs(0);
//	}
//	void bfs(int index) {
//		Node root = nodes[index];
//		Queue<Node> queue = new Queue<Node>
//		queue.enqueue(root);
//		root.marked = true;
//		while(!queue.isEmpty()) { // ���ÿ� �����Ͱ� ���������� 
//			Node r = queue.dequeue(); // ���ÿ��� ������ �ϳ��� ��������
//			for(Node n : r.adjacent) { //������ ����� �ڽĵ��� ���ÿ� �߰��Ѵ�.
//				if(n.marked == false) { // �̶� ���ÿ� �߰����� ���� ���鸸 �߰��Ѵ�.
//					n.marked = true;
//					queue.enqueue(n);
//				}
//			}
//			visit(r);// �湮 ����Լ�
//		}
//	}
//	void dfsR(Node r) {
//		if( r== null)return	;
//		r.marked = true;
//		visit(r);
//		for(Node n : r.adjacent) {
//			if(n.marked == false) {
//				dfsR(n);
//			}
//		}
//	}
//	void dfsR(int index) {
//		Node r = nodes[index];
//		dfsR(r);
//	}
//	void dfsR() {
//		dfsR(0);
//	}
//	public void visit(Node r) {
//		// TODO Auto-generated method stub
//		System.out.println(r.data+" ");
//	}
//}
//
//public class DFSTest {
//
//	public static void main(String[] args) {
//		Graph g = new Grapgh(9);
//		g.addEdge(0, 1);
//		g.addEdge(1, 2);
//		g.addEdge(1, 3);
//		g.addEdge(2, 4);
//		g.addEdge(2, 3);
//		g.addEdge(3, 4);
//		g.addEdge(3, 5);
//	}
//	
//}
