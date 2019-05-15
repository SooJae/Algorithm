package algorithm.sortPractice4;

public class BubbleSort extends Sort {

	@Override
	public void sort(int[] arr) {
		for(int i =0; i<arr.length-1 ; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j+1]<arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
