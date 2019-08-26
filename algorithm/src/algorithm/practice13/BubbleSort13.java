package algorithm.practice13;

public class BubbleSort13 {

	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		
		for(int i = 0; i< arr.length-1 ; i++) {
			for(int j =0 ; j<arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
