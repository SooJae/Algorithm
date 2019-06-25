package algorithm.practice12.sort.sortImpl;

import algorithm.practice12.sort.sort.SSort12;

public class HeapSort12 implements SSort12 {

	public HeapSort12() {
		// TODO Auto-generated constructor stub
		System.out.println("힙정렬 입니다.");
	}
	@Override
	public void sort(int[] arr) {
		
		int length = arr.length;
		for(int i = length/2-1;i>=0;i--) heapify(arr,length,i);
		for(int i = length-1 ; i>=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr,i,0);
		}
	}

	private void heapify(int[] arr, int length, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int largest = i;
		if(l<length && arr[l]>arr[largest]) largest =l;
		if(r<length && arr[r]>arr[largest]) largest =r;
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, length, largest);
		}
		
	}

}
