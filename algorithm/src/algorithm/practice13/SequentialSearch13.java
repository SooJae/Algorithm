package algorithm.practice13;

import java.util.Scanner;

public class SequentialSearch13 {

	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ã�� ���ڸ� �Է��ϼ���");
		int x = in.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] ==x) {
				System.out.println(x);
				return;
			}
		}
		System.out.println("ã�� ���߽��ϴ�.");
	}
}
