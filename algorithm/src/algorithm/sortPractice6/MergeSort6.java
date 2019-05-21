package algorithm.sortPractice6;

public class MergeSort6 {

	public void sort(int[] a, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			sort(a,l,mid);
			sort(a,mid+1,r);
			sortMerge(a,l,mid,r);
		}
	}

	private void sortMerge(int[] a, int l, int mid, int r) {

		int i=l;
		int j= mid+1;
		int k = l;
		int tmpArr[] = new int[a.length];
		
		while(i<=mid && j<=r) {
			if(a[i]<a[j]) tmpArr[k++]=a[i++];
			else tmpArr[k++] = a[j++];
		}
		while(i<=mid) {
			tmpArr[k++]=a[i++];
		}
		while(j<=r) {
			tmpArr[k++]=a[j++];
		}
		
		for(int index=l; index<k; index++) {
			a[index]=tmpArr[index];
		}
	}
}
