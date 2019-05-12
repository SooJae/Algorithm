package algorithm.sortPractice;

public class HeapSort {
	
    public static void main(String args[]) {
        int a[] = {9,1,22,4,0,-1,1,24,100,10};
        heapSort(a);
        for(int x: a) System.out.print(x+" ");
    }
    
    public static void heapSort(int[] arr) {
    	int temp; 
    	int length = arr.length;
    	for(int i=length/2-1; i>=0; i--)  heapify(arr, length, i);
    	for(int i=length-1; i>=0 ; i--) {
    		temp=arr[0];
    		arr[0] = arr[i];
    		arr[i] =temp;
    		heapify(arr,i,0);
    	}
    		
    }
    
    public static void heapify(int[] a, int length, int i) {
    	 int left = 2*i + 1, right = 2*i + 2;
         int temp, largest = i;
         if( left<length && a[left]>a[largest]) largest = left;
         if( right<length && a[right]>a[largest]) largest = right;
         if( largest != i ) {
             temp = a[i]; 
             a[i] = a[largest]; 
             a[largest] = temp;
             heapify(a, length, largest); // 바뀌고 또 바뀔 자식들이 있나 확인하고 다시 바꾼다.
         }
    }
}
