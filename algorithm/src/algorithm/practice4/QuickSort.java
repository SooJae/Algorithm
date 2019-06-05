package algorithm.practice4;

public class QuickSort {

	public void sort(int[] arr, int l, int r) {

		int left = l;
		int right = r;
		int pivot = (left+right)/2;
		
		while(left<=right) {
			while(arr[left]<arr[pivot]) left++;
			while(arr[right]>arr[pivot]) right--;
			
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		if(left < r) sort(arr, left, r); 
		if(l< right) sort(arr, l, right); 
	}

}
