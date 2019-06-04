package algorithm.practice7;

public class MergeSort7 {

	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			mergeSort(arr, l, m, r);
		}
	}
	
	public void mergeSort(int[] arr, int l, int m, int r) {
		int[] tmpArr = new int[arr.length];
		int i = l;
		int j = m+1;
		int k =l;
		
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) tmpArr[k++] = arr[i++];
			else tmpArr[k++] = arr[j++];
		}
		while(i<=m) {
			tmpArr[k++] = arr[i++];
		}
		while(j<=r) {
			tmpArr[k++]=arr[j++];
		}
		
		for(int index = l; index<k; index++) {
			arr[index]= tmpArr[index];
		}
	}

}
