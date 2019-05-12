package algorithm.sortPractice2;

public class InsertionSort {

	public void sort(int[] arr) {
		int j;
		for(int i = 1; i<arr.length; i++) {
			int tmp = arr[i];
			for(j = i-1; j>=0; j--) {
				if(arr[j]<tmp) break;
				arr[j+1]=arr[j];
			}
			arr[j+1]=tmp;
		}
	}
}
