package algorithm.practice10.sort;

public class QuickSort10 {


		public void sort(int[] a, int l, int r) {
			int left = l;
			int right = r;
			int pivot = (l+r)/2;
			do {
				while(a[left]<a[pivot]) left++;
				while(a[right]>a[pivot]) right--;
				
				if(left<=right) {
					int temp = a[left];
					a[left] = a[right];
					a[right] = temp;
					left++;
					right--;
				}
				if(l<right) sort(a,l,right);
				if(left<r) sort(a, left, r);
			}while(left<=right);
		}

//	public void sort(int[] arr, int l, int r) {
//		
//		int left = l;
//		int right = r;
//		int pivot = (left+right)/2;
//		do {
//			while(arr[left]<arr[pivot]) left++;
//			while(arr[right]>arr[pivot]) right--;
//			if(left<=right) {
//				int temp = arr[left];
//				arr[left] = arr[right];
//				arr[right] = temp;
//				left++;
//				right--;
//			}
//		}
//		while(left<=right);
//		
//		if(left<r) sort(arr,left,r);
//		if(l<right) sort(arr,l,right);
//		
//	}

}
