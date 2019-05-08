package sort;

public class MergeSort {
	public static int tmp[] = {};
	
	public static void main(String[] args) {
		int[] a = {10,2,4,8,5,6,1,7,3,9};
		
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
	
	public static void merge(int[] a, int l,int middle, int r) {
		//두 배열을 합친다.
		int i = l;
		int j = middle+1;
		int k =l;//임시 배열을 가리키게
		
		int[] temp = new int[a.length];
		while(i<=middle && j<=r) { // 두개로 나뉘어 진 상태에서 좌측은 중간까지, 우측은 중간 +1 부터 끝까지
			if(a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
			
		while(i <= middle ) { // j<=r이 먼저 끝난경우 (먼저 k배열의 자리를 다 차지했을 경우) 나머지 i값을 차례로 집어넣는다. 
			temp[k++] = a[i++];
		}
		while( j<=r) { //마찬가지로 i<=middle이 먼저끝난경우
			temp[k++]= a[j++];
		}
		
		for(int index = l; index< k; index++) {
			a[index] =temp[index];
		}
	}
}
