package algorithm.sortPractice6;

public class Test {

	public static void main(String[] args) {
		int[] arr = {6,5,77,88,120,3,-71,24,38,-1};
		
		BubbleSort6 bs = new BubbleSort6();
		InsertionSort6 is = new InsertionSort6();
		SelectionSort6 ss = new SelectionSort6();
		MergeSort6 ms = new MergeSort6();
		ms.mergeSort(arr,0,arr.length-1);
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}
