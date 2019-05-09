package sortPractice;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		
		mergeSort(a, 0, a.length-1);
		
		for(int x : a) {
			System.out.println(x);
		}
	}
	
	public static void mergeSort(int[] a, int l,int r) {
		if(l<r) {
			int middle = (l+r)/2;
			mergeSort(a,l,middle);	//하나가 될때까지 배열을 계속 쪼갠다.
			mergeSort(a,middle+1,r);	// 하나가 될때까지 배열을 계속 쪼갠다.
			merge(a,l,middle,r);
		}
	}
	public static void merge(int[] a, int l, int middle, int r) {
		
		int i = l;
		int j = middle +1;
		int k =l;
		int[] tmpArr = new int[a.length];
		
		while(i <= middle && j<=r) {
			if(a[i]<a[j]) tmpArr[k++] = a[i++];
			else tmpArr[k++] = a[j++];
		}
		
		while(i<=middle) {
			tmpArr[k++] = a[i++];
		}
		
		while (j<=r) {
			tmpArr[k++] = a[j++];
		}
		
		for(int index =l; index < k; index++)
			a[index] = tmpArr[index];
	}
	
}
