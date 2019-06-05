package algorithm.practice10.sort;

public class Test {
	public static void main(String[] args) {
		int[] arr = {5,10,4,9,0,1,6,3,7,2,8,-1};
		BubbleSort10 bs = new BubbleSort10();
		InsertionSort10 is = new InsertionSort10();
		SelectionSort10 ss = new SelectionSort10();
		QuickSort10 qs = new QuickSort10(); 
		MergeSort10 ms = new MergeSort10();
		HeapSort10 hs = new HeapSort10();
		hs.sort(arr);
		
		for(int x : arr) {
			System.out.print(x+ " ");
		}
		
	}
}
