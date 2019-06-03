package algorithm.practice9.sort;

public class Test {

	public static void main(String[] args) {
		int[] arr = {5,10,4,9,1,6,3,7,2,8,-1};
		
		BubbleSort bs = new BubbleSort();
		InsertSort is = new InsertSort();
		SelectionSort ss = new SelectionSort();
		QuickSort qs = new QuickSort();
		MergeSort ms = new MergeSort();
		HeapSort hs = new HeapSort();
		
		
		hs.sort(arr);
		
		for(int x : arr) {
			System.out.print( x+" ");
		}
	}
}
