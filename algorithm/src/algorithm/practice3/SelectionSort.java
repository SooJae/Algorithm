package algorithm.practice3;

public class SelectionSort implements Sort{

	@Override
	public void sort(int[] a) {
		for(int i=0; i< a.length; i++) {
			int min = i;
			for(int j =i+1; j<a.length ; j++) {
				if(a[j]<a[min]) min = j;
			}
			int tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
		}
		
	}

}
