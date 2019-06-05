package algorithm.practice10.sort;

public class MergeSort10 {

	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int middle = (l+r)/2;
			sort(arr,l,middle);
			sort(arr,middle+1,r);
			merge(arr,l,middle,r);
		}
	}

	public void merge(int[] arr, int l, int m, int r) {

		int i = l;
		int j = m+1;
		int k = l;
		int[] tempArr =new int[arr.length];
		
		while(i<=m&&j<=r) {
			if(arr[i]<arr[j]) tempArr[k++] = arr[i++];
			else tempArr[k++] = arr[j++];
		}
		while(i<=m) tempArr[k++] = arr[i++];
		while(j<=r) tempArr[k++] = arr[j++];
		
		for(int index=l;index<k; index++) {
			arr[index] = tempArr[index];	
		}
	}
}
