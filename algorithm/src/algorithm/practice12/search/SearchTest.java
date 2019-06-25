package algorithm.practice12.search;

import java.util.Scanner;

public class SearchTest {

	static int[] arr = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값을 입력하세요  : ");
		int key = sc.nextInt();
		
		SequentialSearch12 ss = new SequentialSearch12();
		BinarySearch12 bs = new BinarySearch12();
		
		int result = bs.recurSearch(arr,0,arr.length-1,key);
		//int result = ss.search(arr ,key);
		
		if(result == -1) System.out.println("값이 존재하지 않습니다");
		else System.out.println("값이 "+(result+1)+"번째에 위치해있습니다.");
	}
}
