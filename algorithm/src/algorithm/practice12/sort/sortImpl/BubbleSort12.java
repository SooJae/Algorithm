package algorithm.practice12.sort.sortImpl;

import algorithm.practice12.sort.sort.SSort12;

public class BubbleSort12 implements SSort12{

	public BubbleSort12() {
		System.out.println("버블정렬을 실행합니다.");
	}
	@Override
	public void sort(int[] arr) {
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j =0; j<arr.length-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
