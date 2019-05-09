package sortPractice;

public class HeapSort {
	
    public static void main(String args[]) {
        int a[] = {9,1,22,4,0,-1,1,24,100,10};
        heapSort(a);
        for(int x: a) System.out.print(x+" ");
    }
    
    public static void heapSort(int[] a) {
    	int temp; 
    	int length = a.length;
    	for(int i=length/2-1; i>=0; i--)  heapify(a, length, i);
    	for(int i=length-1; i>=0 ; i--) {
    		temp=a[0];
    		a[0] = a[i];
    		a[i] =temp;
    		heapify(a,i,0);
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
             heapify(a, length, largest); // �ٲ�� �� �ٲ� �ڽĵ��� �ֳ� Ȯ���ϰ� �ٽ� �ٲ۴�.
         }
    }
}
