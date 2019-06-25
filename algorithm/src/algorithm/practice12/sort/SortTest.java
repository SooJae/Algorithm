package algorithm.practice12.sort;

import java.util.Scanner;

import algorithm.practice12.sort.factory.MultipleArgSortFactory12;
import algorithm.practice12.sort.factory.SingleArgSortFactory12;
import algorithm.practice12.sort.factory.SortFactory12;
import algorithm.practice12.sort.sort.MSort12;
import algorithm.practice12.sort.sort.SSort12;
import algorithm.practice12.sort.sort.Sortable;

public class SortTest {
	
	static int[] arr = {5,3,1,7,2,-23,10,8,4,9,6};
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("� ������ ���ϼ���? (bs,ss,is,hs,ms,qs) : ");
		String select= in.nextLine();
		
		
		switch(select) {
			case "bs": case "ss": case "is": case "hs":
				
				SortFactory12 sf = new SingleArgSortFactory12();
				Sortable sSort= sf.createSort12(select);
				((SSort12) sSort).sort(arr);
				break;
			case "ms": case"qs":
				SortFactory12 mf = new MultipleArgSortFactory12();
				Sortable mSort = mf.createSort12(select);
				((MSort12) mSort).sort(arr, 0, arr.length-1);
				break;
				
			default:
				System.out.println("�ٽ� �Է����ּ���");
			
		}
		
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
		
		
		
	}
}