package algorithm.practice5;

public class MergeSort {
	
	public void mergeSort(int a[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a, l, mid, r);
		}
	}
	public void merge(int[] a, int l, int m, int r) {
		int i = l;
		int j = m+1;
		int k = l;
		int[] tmpArr =  new int[a.length];
		
		while(i<=m && j<=r) {
			if(a[i]< a[j]) tmpArr[k++] = a[i++];
			else tmpArr[k++] = a[j++];
		}  
		
		while(i<=m) {
			tmpArr[k++] = a[i++];
		}
		
		while (j<=r) {
			tmpArr[k++] = a[j++];
		}
		for(int index = l; index < k; index++) {
			a[index]=	tmpArr[index];
		}
	}
}
