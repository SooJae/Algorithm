package algorithm.practice12.search;

public class BinarySearch12 {

	public int search(int[] arr, int key) {
		int left =0;
		int right = arr.length-1;
		int mid = 0;
		while(left<=right) {
			mid = (left+right)/2;
			if(arr[mid] == key) return mid;
			else {
				if(arr[mid] > key) right = mid-1;
				else left = mid+1;
			}
		}
		return -1;
	}
	
	public int recurSearch(int[] arr, int left, int right, int key) {
		int mid = (left+right)/2;
		if(left>right) return -1;
		if(arr[mid] == key) return mid;
		else {
			if(arr[mid]>key) {
				right = mid-1;
			}
			else if(arr[mid]<key) {
				left = mid +1 ;
			}
		}
		return recurSearch(arr, left, right, key);
	}

	
}
