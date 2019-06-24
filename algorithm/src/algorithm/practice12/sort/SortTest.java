package algorithm.practice12.sort;

import java.util.Scanner;

import algorithm.practice12.sort.factory.MultipleArgSortFactory12;
import algorithm.practice12.sort.factory.SingleArgSortFactory12;
import algorithm.practice12.sort.factory.SortFactory12;
import algorithm.practice12.sort.sort.MSort12;
import algorithm.practice12.sort.sort.SSort12;

public class SortTest {
	
	static int[] arr = {5,3,1,7,2,-23,10,8,4,9,6};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("어떤 정렬을 원하세요? (bs,ss,is,hs,ms,qs) : ");
		String select= in.nextLine();
		
		
		switch(select) {
			case "bs": case "ss": case "is": case "hs":
				
				SortFactory12<SSort12> sf = new SingleArgSortFactory12();
				SSort12 sSort= sf.createSort12(select);
				sSort.sort(arr);
				break;
			case "ms": case"qs":
				SortFactory12<MSort12> mf = new MultipleArgSortFactory12();
				MSort12 mSort = mf.createSort12(select);
				mSort.sort(arr, 0, arr.length-1);
				break;
				
			default:
				System.out.println("다시 입력해주세요");
			
		}
		
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		
		
	}
}
