package algorithm.practice9.sort;

public class MergeSort {

	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr, l,m);//하나가 될때까지 배열을 계속 쪼갠다.
			sort(arr, m+1, r);//하나가 될때까지 배열을 계속 쪼갠다.
			merge(arr,l,m,r);
		}
		
	}

	private void merge(int[] arr, int l, int m, int r) {

		int i = l;
		int j = m+1;
		int k =l;
		
		int[] tmpArr = new int[arr.length];
		
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) tmpArr[k++] = arr[i++];
			else tmpArr[k++] = arr[j++];
		}
		
		while(i<=m) {
			tmpArr[k++] = arr[i++];
		}
		while(j<=r) {
			tmpArr[k++] = arr[j++];
		}
		
		for(int index = l; index<k;index++) {
			arr[index] = tmpArr[index];
		}
	}

}
