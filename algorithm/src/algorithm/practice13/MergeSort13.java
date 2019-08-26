package algorithm.practice13;

public class MergeSort13 {

	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		sort(arr,0,arr.length-1);
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
	public static void sort(int[] arr, int left, int right) {
		if(left<right) {
			int middle = (left+right)/2;
			sort(arr,left,middle);
			sort(arr,middle+1,right);
			mergeSort(arr,left,middle,right);
		}
	}
	private static void mergeSort(int[] arr, int left, int middle, int right) {
		int i = left;
		int j = middle+1;
		int k = left;
		
		int[] tempArr = new int[arr.length];
		
		while(i<=middle && j<=right) {
			if(arr[i]<arr[j]) tempArr[k++] = arr[i++];
			else tempArr[k++]= arr[j++];
		}
		
		while(i<=middle) tempArr[k++] = arr[i++];
		while(j<=right) tempArr[k++] = arr[j++];
		
		for(int index= left ; index<k; index++) {
			arr[index]=tempArr[index];
		}
		
	}
}
