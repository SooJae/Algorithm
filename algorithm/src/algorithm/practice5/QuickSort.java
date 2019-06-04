package algorithm.practice5;

public class QuickSort {

	public void sort(int[] a , int l, int r) {
		int left = l;
		int right = r;
		int p = (l+r)/2;
		while(left<=right) {
			while(a[left]<a[p]) left++;
			while(a[right]<a[p]) right--;
			
			if(left<=right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			if(l<right) sort(a,l,right);
			if(left<r) sort(a,left,r);
		
		}
	}
}
