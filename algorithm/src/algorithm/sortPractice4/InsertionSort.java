package algorithm.sortPractice4;

public class InsertionSort extends Sort {

	@Override
	public void sort(int[] arr) {
		int j;
		for(int i =1; i<arr.length; i++) {
			int temp = arr[i];
			for(j = i-1;j>=0; j--) {
				if(temp>arr[j]) break;
				arr[j+1] = arr[j];
			}
			arr[j+1]=temp;
		}
	}

}
