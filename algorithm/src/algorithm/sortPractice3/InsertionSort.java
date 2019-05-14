package algorithm.sortPractice3;

public class InsertionSort implements Sort{

	public void sort(int[] a) {
		int j;
		for(int i = 1; i<a.length; i++) {
			int temp = a[i];
			for(j = i-1 ; j>=0; j--) {
				if(temp > a[j]) break;
				a[j+1]= a[j];
			}
			a[j+1] =temp;
		}
	}
}
