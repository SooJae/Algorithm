package algorithm.practice11.sort;

public class QuickSort11 {

	public void sort(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int pivot = (l+r) /2 ;
		do {
			while(arr[l]<arr[pivot]) l++;
			while(arr[r]>arr[pivot]) r--;
		
			if(l<=r) {
				int temp = arr[l];
				arr[l]= arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
			if(l<right) sort(arr,l,right);
			if(left<r) sort(arr, left , r);
		}while(l<=r);
	}

}
