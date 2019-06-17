package algorithm.practice11.sort;

public class MergeSort11 {

	public void sort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			mergeSort(arr,left,mid,right);
		}
		
	}

	private void mergeSort(int[] arr, int left, int mid, int right) {

		int i = left;
		int j = mid+1;
		int k = left;
		int[] tmpArr = new int[arr.length];
		
		while(i<=mid && j<=right) {
			if(arr[i]<arr[j]) tmpArr[k++] = arr[i++];
			else tmpArr[k++] = arr[j++];
		}
		while(i<=mid) tmpArr[k++] = arr[i++];
		while(j<=right) tmpArr[k++] = arr[j++];
		
		for(int index=left;index<k; index++) {
			arr[index] = tmpArr[index];	
		}
	}

}
