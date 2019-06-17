package algorithm.practice11.sort;

public class Main {

	public static void main(String[] args) {
		int[] arr = {9,2,5,8,10,3,4,6,1,7};
		BubbleSort11 bs = new BubbleSort11();
		SelectionSort11 ss = new SelectionSort11();
		InsertionSort11 is = new InsertionSort11(); 
		QuickSort11 qs = new QuickSort11();
		MergeSort11 ms = new MergeSort11();
		HeapSort11 hs = new HeapSort11();
		hs.sort(arr);
		
		for(int x : arr) {
			System.out.print(x + " ");
		}
	}
}
