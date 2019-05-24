package algorithm.sortPractice6;

public class QuickSort6 {

	public void sort(int[] a, int l, int r) {
		int left = l;
		int right = r;
		int pivot = (l+r)/2;
		
		while(left<=right) {
			while(a[left]<a[pivot]) left++;
			while(a[right]>a[pivot]) right--;
			
			if(left<=right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			if(l<right) sort(a,l,right);
			if(left<r) sort(a, left, r);
		}
	}
}
