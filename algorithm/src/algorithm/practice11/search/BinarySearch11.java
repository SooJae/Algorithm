package algorithm.practice11.search;

public class BinarySearch11 {

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
	
	public int searchRucur(int target, int left, int right, int[] arr) {
		int mid = (left+right)/2;
		//if(left > right) return -1;
		//else {
			if(arr[mid] == target) return mid;
			else {
				if(arr[mid] > target) {
					right = mid -1;
					searchRucur(target, left, right, arr);
				}
				else {
					left = mid+1;
					searchRucur(target, left, right, arr);
				}
			}
		//}
		return -1;
	}

}
