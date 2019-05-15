package algorithm.sortPractice4;

public class Test{
	
	public static void main(String[] args) {
		int[] arr = {5,10,4,9,66,1,6,3,7,2,8,-1};
		
		Sort bs = new BubbleSort();
		Sort is = new InsertionSort();
		Sort ss = new SelectionSort();
		//MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
//		ms.sort(arr, 0, arr.length-1);
		qs.sort(arr, 0 , arr.length-1);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}

}
