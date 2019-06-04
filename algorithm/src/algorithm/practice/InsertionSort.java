package algorithm.practice;

public class InsertionSort {
	
	public static void main(String[] args) {
		int a[] = {10,1,5,2,3,4,6};
		
		sort(a);
		
		for(int x : a) System.out.println(x);
		
	}
	
	static public void sort(int[] a ) {
		int j;
		for(int i =1; i< a.length; i++) {
			int temp =a[i]; //a[1]
			for(j =i-1; j>=0 ; j--) {
				if(a[j]<temp) break; //a[0] < a[1]
				 a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
	}
}
