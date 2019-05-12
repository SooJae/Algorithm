package algorithm.sort;

public class HeapSort {
	
//	public static void heapsort(int[] data) {
//		int len = data.length;
//		
//		for(int i=len/2; i>0; i--) { // �� ���� /2 = �ڽ��� ������ ������ ���
//			downHeap(data, i, len);
//		}
//		
//		do {
//			int temp = data[0];
//			data[0] = data[len-1];
//			data[len-1] = temp;
//			len = len-1;
//			
//			downHeap(data, 1, len); // len -> ������ ��ġ�� ��Ÿ��
//		} while(len > 1);
//	}
//	
//	public static void downHeap(int[] data, int i, int len) {
//		int j;
//		int temp = data[i-1];
//		while(i <= len/2) { // �ڽ��� ���翩�θ� Ȯ��
//			j = 2*i; // j -> ������ �ڽ�
//			if((j<len) && (data[j-1] < data[j])) { // ���� �ڽİ� ������ �ڽ��� ���� �� ū ���� ������ �ڽĵ�
//				j++;
//			}
//			if(temp >= data[j-1]) { // temp�� ���Ѵ�. temp�� ũ�� ������ ��ġ �̹Ƿ� ���ǹ� ��
//				break;
//			}
//			data[i-1] = data[j-1];
//			i = j;
//		}
//		data[i-1] = temp;
//	}
//	public static void main(String[] args) {
//		int [] data = {4, 54, 2, 8, 63, 7, 55, 56};
//		// �� ���� ��
//		System.out.println("# �� ���� ��");
//		for(int i=0; i<data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
//		System.out.println();
//		// �� ���� ��
//		heapsort(data);
//		System.out.println("# �� ���� ��");
//		for(int i=0; i<data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
//	}
	
    private static void heapify(int arr[], int length, int i) { //arr, 10, 4
        int left = 2*i + 1, right = 2*i + 2; // �ڽĵ� 9 10
        int temp; 
        int largest = i; // �ڱ��ڽ�
        
        if( left<length && arr[left]>arr[largest]) largest = left;  // left = 9, largest�� �ڽĳ��
        if( right<length && arr[right]>arr[largest]) largest = right; //�����Ƿ� X
        
        if( largest != i ) { // ���� ���� 4�� �ƴϸ� �ΰ��� �ٲ��ش�.
            temp = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = temp;
            heapify(arr, length, largest); // arr, 10, 9
        }
    }
    private static void heapSort(int arr[]) {
        int temp, length = arr.length;
        for(int i=length/2-1; i>=0; i--)  //4 3 2 1 0 
        	heapify(arr, length, i); // �ڽ��� ������ ù��° ��尡 length /2 �� �ֱ⶧���� �̺��� ū ���� heapify�� �� �ʿ䰡 ����.
        
        ////��������� ���� ����
        
        //������
        for(int i=length-1; i>=0; i--) {
            temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void main(String args[]) {
        int arr[] = {9,1,22,4,0,-1,1,24,100,10};
        heapSort(arr);
        for(int x: arr) System.out.print(x+" ");
        // -1 0 1 1 4 9 10 22 22 100 
    }
}
