package algorithm.practice9.sort;

public class SelectionSort {

	public void sort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			int min = arr[i];
			for(int j = i+1; j<arr.length; j++) {
				if(arr[min] > arr[j]) min = j;
			}
			int temp= arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
