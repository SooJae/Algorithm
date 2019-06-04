package algorithm.practice3;

public class Main {

	public static void main(String[] args) {
		int[] arr = {5,10,4,9,66,1,6,3,7,2,8,-1};
		
		Sort bs = new BubbleSort();
		Sort is = new InsertionSort();
		Sort ss = new SelectionSort();
		QuickSort qs = new QuickSort();
		qs.sort(arr,0,arr.length-1);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
