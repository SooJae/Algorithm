package sort;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		
		quickSort(a, 0, a.length-1);
		
		for(int x : a) {
			System.out.println(x);
		}
	}
	
	public static void quickSort(int[] a,int l, int r) {
		int left = l;
		int right = r;
		int middle = (l+r)/2;
		do {
			while(a[left]<a[middle]) left++;
			while(a[right]>a[middle]) right--;
			if(left<=right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		} while(left<= right);
		if(l<right) quickSort(a,l,right);
		if(r>left) quickSort(a, left, r);
	}
}
