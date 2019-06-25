package algorithm.practice10.search;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,66};
		Scanner sc = new Scanner(System.in); 
		System.out.print("찾을 값을 입력하세요 : ");
		int key= sc.nextInt();
		
		SequentialSearch sq = new SequentialSearch();
		BinarySearch10 bs = new BinarySearch10();
//		
//		if(sq.search(arr,key)==-1) System.out.println("값을 찾을 수 없습니다.");
//		else System.out.println(sq.search(arr,key)+1+"번째에 위치해있습니다.");
//		System.out.println(bs.search(arr,key)+1 +"번째에 위치해있습니다.");
		System.out.println(bs.searchRecur(arr,0,arr.length-1,key)+1 +"번째에 위치해있습니다.");
		
	}
}
