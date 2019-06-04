package algorithm.practice2;

public class Main {

	public static void main(String[] args) {
		int[] arr = {5,10,4,9,1,6,3,7,2,8};
		
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		QuickSort qs = new QuickSort();
		MergeSort ms = new MergeSort();
		HeapSort hs = new HeapSort();
		
		
		//bs.sort(arr);
		qs.sort(arr,0,arr.length-1);
		//hs.sort(arr);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
