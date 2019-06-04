//package data_structure.practice3.tree;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Stack;
//
//class Graph{
//	class Node{
//		int data;
//		LinkedList<Node> adjacent; // 인접한 노드가 무엇이냐를 저장함
//		boolean marked; //방문 했는지를 마킹하는 플래그 
//		public Node(int data){
//			this.data = data;
//			this.marked = false;
//			adjacent = new LinkedList<Node>();
//		}
//	}
//	Node[] nodes; //노드를 저장할 배열
//	
//	public Graph(int size) {
//		nodes = new Node[size];
//		for(int i = 0; i<size; i++) {
//			nodes[i] = new Node(i); // 편의를 위해서 데이터 배열방 번호를 정해줌
//		}
//	}
//	//두 노드의 관계를 저장하는 함수 addEdge
//	void addEdge(int i1, int i2) {
//		Node n1 = nodes[i1]; // 데이터가 인덱스랑 같으므로 인자값을 인덱스로 사용할 수 있다.
//		Node n2 = nodes[i2]; // 데이터가 인덱스랑 같으므로 인자값을 인덱스로 사용할 수 있다.
//		if(!n1.adjacent.contains(n2)) {
//			n1.adjacent.add(n2); // 두개의 노드의 인접한 노드를 저장하는 linkedList에  상대방이 있는지 확인하고 없으면 서로 추가를 해준다.
//		}
//		if(!n2.adjacent.contains(n1)) {
//			n2.adjacent.add(n1); // 두개의 노드의 인접한 노드를 저장하는 linkedList에  상대방이 있는지 확인하고 없으면 서로 추가를 해준다.
//		}
//	}
//	void dfs() {
//		dfs(0); // dfs함수를 그냥 호출하면 0번부터 시작
//	}
//	void dfs(int index) {
//		Node root = nodes[index];// 해당인덱스로 노드를 가져온 후
//		Stack<Node> stack = new Stack<Node>(); // 스택에 저장한다.
//		stack.push(root); 
//		root.marked = true ; // 그리고 스택에 들어갔다고 마킹한다.
//		
//		while(!stack.isEmpty()) { // 스택에 데이터가 없을때까지 
//			Node r = stack.pop(); // 스택에서 데이터 하나를 가져오고
//			for(Node n : r.adjacent) { //가져온 노드의 자식들을 스택에 추가한다.
//				if(n.marked == false) { // 이때 스택에 추가되지 않은 노드들만 추가한다.
//					n.marked = true;
//					stack.push(n);
//				}
//			}
//			visit(r);// 방문 출력함수
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
//		while(!queue.isEmpty()) { // 스택에 데이터가 없을때까지 
//			Node r = queue.dequeue(); // 스택에서 데이터 하나를 가져오고
//			for(Node n : r.adjacent) { //가져온 노드의 자식들을 스택에 추가한다.
//				if(n.marked == false) { // 이때 스택에 추가되지 않은 노드들만 추가한다.
//					n.marked = true;
//					queue.enqueue(n);
//				}
//			}
//			visit(r);// 방문 출력함수
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
