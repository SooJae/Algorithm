package algorithm.sortPractice5;

public class Test {

	public static void main(String[] args) {
		int[] arr = {11,5,777,77,100,3,-7,2,8,-1};
		
		BubbleSort bs = new BubbleSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr,0,arr.length-1);
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}
