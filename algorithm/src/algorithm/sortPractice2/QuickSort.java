package algorithm.sortPractice2;

public class QuickSort {

	public void sort(int[] arr, int l, int r){
		int left = l;
		int right = r;
		int pivot = (left+right)/2;
		do {
			while(arr[left]<arr[pivot]) left++;
			while(arr[right]>arr[pivot]) right--;
			
			if(left<=right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}while(left<=right);
		
		if(l< pivot) sort(arr, l, pivot); 
		if(pivot < r) sort(arr, pivot, r); 
		
	}
}
