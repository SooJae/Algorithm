package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		//int temp=0;
		int j =0;
		for(int i =1 ; i < a.length; i++) {
			int temp = a[i];
			for(j=i-1; j>=0 && temp < a[j] ; j--) {
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		
		
		
		for(int x : a) {
			System.out.println(x);
		}
	}
}
