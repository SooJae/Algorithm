package algorithm.practice11.search;

public class SequentialSearch11 {

	public int search(int[] arr, int key) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==key) return i;
		}
		return -1;
	}

}
