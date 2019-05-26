package algorithm.sortPractice7;

public class HeapSort7 {

	public void sort(int[] a) {
		int length = a.length;
		for(int i=length/2-1; i>=0; i--) heapify(a,length,i);
		for(int i=length-1;i>=0; i--) {
			int temp=a[0];
    		a[0] = a[i];
    		a[i] =temp;
    		heapify(a,i,0);
		}
	}

	private void heapify(int[] a, int length, int i) {
		int left = 2*i+1;
		int right = 2*i+2;
		
		int largest = i;
		if(left<length && a[left]>a[largest]) largest = left;
		if(right<length && a[right]>a[largest]) largest = right;
		if(largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			heapify(a, length, largest);
		}
	}
}
