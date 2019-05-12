package algorithm.sortPractice;

public class SelectionSort {
	
	public static void main(String[] args) {
		int a[] = {10,1,5,2,3,4,6};
		
		sort(a);
		
		for(int x : a) System.out.println(x);
		
	}
	
	static public void sort(int[] a ) {
		for(int i = 0; i<a.length; i++) {
			int min = i;
			for(int j =1+i; j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
		}
		
		
	}
}
