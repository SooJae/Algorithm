package algorithm.practice2;

public class SelectionSort {

	public void sort(int[] arr) {
		for(int i =0; i<arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			int tmp = arr[min];
			arr[min] = arr[i];
			arr[i] =tmp;
		}
	}
}
