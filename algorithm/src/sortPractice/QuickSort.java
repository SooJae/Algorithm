package sortPractice;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		
		quickSort(a, 0, a.length-1);
		
		for(int x : a) {
			System.out.println(x);
		}
	}
	
	public static void quickSort(int[] a, int l,int r) {
		int left = l;
		int right =r;
		int pivot = (left + right)/2;
		
		while(a[left]<a[pivot]) left++;
		while(a[right]>a[pivot]) right--;
		if(left<=right) {
			int tmp = a[left];
			a[left] = a[right];
			a[right] = tmp;
			left++;
			right--;
		}
		
		if(left < r) quickSort(a, left, r);
		if(l< right) quickSort(a, l, right);
				
	}
	
}
