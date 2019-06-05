package algorithm.practice10.sort;

public class HeapSort10 {

	public void sort(int[] arr) {
		int length = arr.length;
		for(int i = length/2-1; i>=0; i--) heapify(arr, length, i);
		for(int i = length-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
		
	}
	
	public void heapify(int[] arr, int length, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int largest =i;
		if(l<length && arr[l]>arr[largest]) largest = l;
		if(r<length && arr[r]>arr[largest]) largest = r;
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr,length,largest);
		}
		
	}

}
