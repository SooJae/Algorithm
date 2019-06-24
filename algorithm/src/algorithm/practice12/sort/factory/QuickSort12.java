package algorithm.practice12.sort.factory;

import algorithm.practice12.sort.sort.MSort12;

public class QuickSort12 implements MSort12 {

	public QuickSort12() {

		System.out.println("퀵정렬 입니다.");
	}
	@Override
	public void sort(int[] arr, int left, int right) {

		int l = left;
		int r = right;
		int pivot = (left+right)/2;
		
		do {
			while(arr[l]<arr[pivot]) l++;
			while(arr[r]>arr[pivot]) r--;
			if(l<=r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			if(l<right) sort(arr, l, right);
			if(left<r) sort(arr,left,r);
		}while(l<=r);
			
	}

}
