package algorithm.practice7;

public class QuickSort7 {

	public void sort(int[] a, int left, int right) {

		int l=left;
		int r=right;
		int pivot = (l+r)/2;
		do {
			while(a[l]<a[pivot]) l++;
			while(a[r]>a[pivot]) r--;
			if(l<=r) {
				int tmp = a[l];
				a[l] = a[r];
				a[r] = tmp;
				l++;
				r--;
			}
			if(left<r) sort(a,left,r);
			if(right<l) sort(a,l,right);
		}while(l<=r);
	}

}
