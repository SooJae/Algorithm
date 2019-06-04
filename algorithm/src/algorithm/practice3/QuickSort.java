package algorithm.practice3;

public class QuickSort {

	public void sort(int a[], int l, int r ) {
		int left = l;
		int right = r;
		int pivot = (l+r)/2;
		
		while(a[left]<a[pivot]) left++;
		while(a[right]>a[pivot]) right--;
		if(left<=right) {
			int tmp = a[left];
			a[left] = a[right];
			a[right] = tmp;
			left++;
			right--;
		}
		
		if(left < r) sort(a, left, r);
		if(right>l) sort(a, l,right);
		
	}
}
