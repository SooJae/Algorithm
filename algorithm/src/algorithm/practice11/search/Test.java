package algorithm.practice11.search;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,66};
		Scanner sc = new Scanner(System.in); 
		System.out.print("ã�� ���� �Է��ϼ��� : ");
		int key= sc.nextInt();
		
//		SequentialSearch11 sq = new SequentialSearch11();
		BinarySearch11 bs = new BinarySearch11();
		
		if(bs.search(arr,key)==-1) System.out.println("���� ã�� �� �����ϴ�.");
		else System.out.println(bs.search(arr,key)+1+"��°�� ��ġ���ֽ��ϴ�.");
		
	}
}
