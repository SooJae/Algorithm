package algorithm.practice12.sort.sortImpl;

import algorithm.practice12.sort.sort.SSort12;

public class InsertionSort12 implements SSort12 {

	public InsertionSort12() {
		System.out.println("선택정렬을 실행합니다.");
	}
	@Override
	public void sort(int[] arr) {

		int j,temp;
		for(int i =1;i<arr.length; i++) {
			temp = arr[i];
			for(j = i-1;j>=0; j--) {
				if(temp>arr[j]) break;
				arr[j+1]=arr[j];
			}
			arr[j+1] = temp;
		}
		
	}

}
