package algorithm.practice10.search;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,66};
		Scanner sc = new Scanner(System.in); 
		System.out.print("ã�� ���� �Է��ϼ��� : ");
		int key= sc.nextInt();
		
		SequentialSearch sq = new SequentialSearch();
		//BinarySearch bs = new BinarySearch();
		
		if(sq.search(arr,key)==-1) System.out.println("���� ã�� �� �����ϴ�.");
		else System.out.println(sq.search(arr,key)+1+"��°�� ��ġ���ֽ��ϴ�.");
		//System.out.println(bs.search(se,arr)+1 +"��°�� ��ġ���ֽ��ϴ�.");
		
	}
}