package algorithm.practice9.sort;

public class QuickSort {

	public void sort(int[] arr, int left, int right) {
		int l = left;
		int r = right;
		int pivot = (l+r)/2;
		do {
			while(arr[l]<arr[pivot]) l++;
			while(arr[r]>arr[pivot]) r--;
			if(l<=r) {
				int tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
				l++;
				r--;
			}
		}while(l<=r);
		
		if(left<r) sort(arr, left,r);
		if(l<right) sort(arr, l, right);
		
	}

}
