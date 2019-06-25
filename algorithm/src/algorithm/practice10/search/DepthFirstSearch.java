package algorithm.practice10.search;

import java.util.Scanner;

public class DepthFirstSearch {

	static int vertex; // ������ ����
	static int startVertex; // ���� ����
	static int[][] vertexMap; // ���� ��� ��
	static int[] vertexVisit; // ������ �湮 ���θ� ����Ű�� �迭
	static int vt1, vt2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		vertex = sc.nextInt(); // ������ ���� �Է�
		//startVertex = Integer.parseInt(sc.nextLine().trim());
		startVertex = sc.nextInt();
		System.out.println("vertex : " +vertex );
		System.out.println("startVertex : "+startVertex);
		vertexMap = new int[vertex+1][vertex+1];//+1�� ��Ų ������ ������ ������ 0�̾ƴ� 1�ν����ϱ� ���ؼ��̴�.!
		vertexVisit = new int[vertex+1]; //+1�� ��Ų ������ ������ ������ 0�̾ƴ� 1�ν����ϱ� ���ؼ��̴�.!
		System.out.println("vertexMap"+ vertexMap);
		System.out.println("vertexVisit"+ vertexVisit);
		
		while(true) {
			vt1 = sc.nextInt();
			vt2 = sc.nextInt();
			
			//8 1
			//1 2 1 3 2 4 2 5 4 8 5 8 3 6 3 7 6 8 7 8 -1 -1
			
			if(vt1<0 && vt2 <0) break;// �ΰ��� ���� 0���� ������� break;
			
			vertexMap[vt1][vt2] = vertexMap[vt2][vt1]=1;
			//���� vt1�� vt2�� ����Ǿ����� ǥ��
	        //��������� ������ �����ϸ� ���� �ڵ带 ������ �� �ֽ��ϴ�. 
			//���� ��� 1���� 2������ ����Ǿ����� [1][2] �� [2][1] �迭�� �ڸ��� 1�̵ȴ�.
		}
		dfs(startVertex);	//dfs�� ����
	}
	
	public static void dfs(int start) {
		vertexVisit[start] = 1;
		
		for(int i = 1; i<= vertex; i++) {
			if(vertexMap[start][i]==1 && vertexVisit[i]==0) {
				System.out.println(start +"->"+ i +"�� �̵��մϴ�.");
				dfs(i);
			}
		}
	}
}


