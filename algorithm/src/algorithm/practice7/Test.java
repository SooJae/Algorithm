package algorithm.practice7;


public class Test {

	public static void main(String[] args) {
		int[] arr = {9,2,5,8,10,3,4,6,1,7};
		
		BubbleSort7 bs = new BubbleSort7();
		InsertionSort7 is = new InsertionSort7();
		SelectionSort7 ss = new SelectionSort7();
		MergeSort7 ms = new MergeSort7();
		QuickSort7 qs = new QuickSort7();
		HeapSort7 hs = new HeapSort7();
		//qs.sort(arr,0,arr.length-1);
		hs.sort(arr);
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}
