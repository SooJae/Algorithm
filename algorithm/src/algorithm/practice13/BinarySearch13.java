package algorithm.practice13;

import java.util.Scanner;

public class BinarySearch13 {

	static int arr[]= {1,3,4,5,6,7,8,9};
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("찾을 값을 알려주세요.");
		int x = in.nextInt();
		
		System.out.println("입니다."+binary(arr,x));

			
	}
	
	public static int binary(int[] a ,int key) {
		int l = 0;
		int r = arr.length-1;
		int mid = (l+r)/2;
		while(l<=r) {
			mid = (l+r)/2;
			if(arr[mid] ==key) return mid;
			else {
				if(arr[mid]>key) r = mid -1;
				else l = mid+1;
			}
		}
		return -1;
	
	}
}
