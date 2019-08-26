package algorithm.practice13;

public class QuickSort13 {

	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		quickSort(arr, 0, arr.length-1);
		
		for(int x : arr) {
			System.out.println(x);
		}
	}
	

	public static void quickSort(int[] arr, int left, int right) {
		int i = left;
		int j = right;
		int pivot = (left+right)/2;
		
		do {
			while(arr[i]<arr[pivot]) i++;
			while(arr[j]>arr[pivot]) j--;
			
			if(i<=j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if(i<right) quickSort(arr,i,right);
			if(j>left) quickSort(arr,left,j);
		}while(i<=j);
	}
}
