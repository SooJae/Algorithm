package algorithm.practice12.sort.sortImpl;

import algorithm.practice12.sort.sort.MSort12;

public class MergeSort12 implements MSort12 {

	@Override
	public void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			mergeSort(arr,left,mid,right);
			
		}
	}
	
	public void mergeSort(int[] arr, int l, int m, int r ) {
		int i = l;
		int j = m+1;
		int k = l;
		int[] tempArr = new int[arr.length];
		
		while(i<=m && j<=r) {
			if(arr[i]<arr[j]) tempArr[k++] = arr[i++];
			else tempArr[k++] = arr[j++];
		}
		
		while(i<=m) tempArr[k++]= arr[i++];
		while(j<=r) tempArr[k++]= arr[j++];
		
		for(int index=l;index<k;index++) {
			arr[index] = tempArr[index];
		}
		

	}


}
