package algorithm.practice12.search;

import java.util.Scanner;

public class SearchTest {

	static int[] arr = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ���� �Է��ϼ���  : ");
		int key = sc.nextInt();
		
		SequentialSearch12 ss = new SequentialSearch12();
		BinarySearch12 bs = new BinarySearch12();
		
		int result = bs.recurSearch(arr,0,arr.length-1,key);
		//int result = ss.search(arr ,key);
		
		if(result == -1) System.out.println("���� �������� �ʽ��ϴ�");
		else System.out.println("���� "+(result+1)+"��°�� ��ġ���ֽ��ϴ�.");
	}
}
