package algorithm.practice4;

public class SelectionSort extends Sort {

	@Override
	public void sort(int[] arr) {
		for(int i =0; i<arr.length; i++) {
			int min= i;
			for(int j=i+1; j<arr.length; j++ ) {
				if(arr[min]>arr[j]) min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

}
