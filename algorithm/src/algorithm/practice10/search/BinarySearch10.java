package algorithm.practice10.search;

public class BinarySearch10 {

	public int search(int[] arr, int key) {

		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int middle = (left + right) / 2;
			if (arr[middle] == key)
				return middle;
			else {
				if (key < arr[middle])
					right = middle - 1;
				else
					left = middle + 1;
			}
		}
		return -1;
	}

	public int searchRecur(int[] arr, int left, int right, int key) {
		int mid = (left + right) / 2;
		if (left > right)
			return -1;
		else {
			if (arr[mid] == key)
				return mid;
			else {
				if (arr[mid] > key) {
					right = mid - 1;
					return searchRecur(arr, left, right, key);
				} else {
					left = mid + 1;
					return searchRecur(arr, left, right, key);
				}
			}
		}
	}

}
