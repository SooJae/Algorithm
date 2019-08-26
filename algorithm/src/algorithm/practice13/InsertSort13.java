package algorithm.practice13;

public class InsertSort13 {
	static int arr[]= {6,1,3,9,10,7,5,2,4,8};
	public static void main(String[] args) {
		
		int j;
		for(int i = 1 ; i<arr.length ; i++) {
			int temp = arr[i]; 
			for( j = i-1; j>=0; j--) {
				if(temp > arr[j]) break;
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		
		for(int x: arr) {
			System.out.print(x+" ");
		}
		
	}
}
