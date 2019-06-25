package algorithm.practice12.sort.sortImpl;

import algorithm.practice12.sort.sort.SSort12;

public class SelectionSort12 implements SSort12 {

	public SelectionSort12() {
		System.out.println("선택정렬을 실행합니다.");
	}
	@Override
	public void sort(int[] arr) {
		for(int i = 0; i<arr.length;i++) {
			int min = i;
			for(int j = i+1; j<arr.length;j++) {
				if (arr[min] > arr[j]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
