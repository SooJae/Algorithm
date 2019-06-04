package algorithm.practice2;

public class MergeSort {

	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int middle = (l+r)/2;
			sort(arr,l,middle);
			sort(arr,middle+1,r);
			merge(arr,l, middle, r);
		}
	}
	public void merge(int[] arr, int l, int middle, int r) {
		int i = l;
		int j = middle+1;
		int k = l;
		int[] tmpArr = new int[arr.length];
		
		while(i<=middle && j<=r) {
			if(arr[i]<arr[j]) tmpArr[k++] = arr[i++];
			else tmpArr[k++] = arr[j++];
		}
		while(i<=middle) {
			tmpArr[k++] = arr[i++];
		}
		
		while (j<=r) {
			tmpArr[k++] = arr[j++];
		}
		
		for(int index = l; index < k; index++) {
			System.out.println("l:"+l+" k:"+k);
			arr[index] = tmpArr[index];
		}
	}
}
