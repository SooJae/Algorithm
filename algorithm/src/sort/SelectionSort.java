package sort;

public class SelectionSort {
	
	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		
		for(int i = 0; i<a.length-1; i++) {
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
		for(int x : a) {
			System.out.println(x);
		}
	}
	
}
