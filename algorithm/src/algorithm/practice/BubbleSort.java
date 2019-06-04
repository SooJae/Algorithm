package algorithm.practice;

public class BubbleSort {
	
	public static void main(String[] args) {
		int a[] = {10,1,5,2,3,4,6,};
		
		sort(a);
		
		for(int x : a) System.out.println(x);
		
	}
	
	static public void sort(int[] a ) {
		for(int i = 0 ; i< a.length-1; i++) {
			for(int j = 0 ; j<a.length-i-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
