package algorithm.practice8;

public class Test {
	public static void main(String[] args) {
		int[] arr = {9,2,-1,5,8,10,3,4,6,1,7};
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		
		bs.sort(arr);
		
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}
}
