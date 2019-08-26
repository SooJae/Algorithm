package algorithm.practice13;

public class SelectionSort13 {

	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		for(int i =0; i<arr.length; i++) {
			int min = i;
			for(int j = i+1; j<arr.length;j++ ) {
				if(arr[min]>arr[j]) min =j;
			}
			int temp =arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int x : arr) System.out.println(x);
	}
	
}
