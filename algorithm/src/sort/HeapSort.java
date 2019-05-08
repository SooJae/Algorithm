package sort;

public class HeapSort {
	
//	public static void heapsort(int[] data) {
//		int len = data.length;
//		
//		for(int i=len/2; i>0; i--) { // 총 길이 /2 = 자식을 가지는 마지막 노드
//			downHeap(data, i, len);
//		}
//		
//		do {
//			int temp = data[0];
//			data[0] = data[len-1];
//			data[len-1] = temp;
//			len = len-1;
//			
//			downHeap(data, 1, len); // len -> 정렬의 위치를 나타냄
//		} while(len > 1);
//	}
//	
//	public static void downHeap(int[] data, int i, int len) {
//		int j;
//		int temp = data[i-1];
//		while(i <= len/2) { // 자식의 존재여부를 확인
//			j = 2*i; // j -> 오른쪽 자식
//			if((j<len) && (data[j-1] < data[j])) { // 왼쪽 자식과 오른쪽 자식을 비교해 더 큰 값을 가지는 자식들
//				j++;
//			}
//			if(temp >= data[j-1]) { // temp와 비교한다. temp가 크면 적절한 위치 이므로 조건문 끝
//				break;
//			}
//			data[i-1] = data[j-1];
//			i = j;
//		}
//		data[i-1] = temp;
//	}
//	public static void main(String[] args) {
//		int [] data = {4, 54, 2, 8, 63, 7, 55, 56};
//		// 힙 정렬 전
//		System.out.println("# 힙 정렬 전");
//		for(int i=0; i<data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
//		System.out.println();
//		// 힙 정렬 후
//		heapsort(data);
//		System.out.println("# 힙 정렬 후");
//		for(int i=0; i<data.length; i++) {
//			System.out.print(data[i]+" ");
//		}
//	}
	
    private static void heapify(int arr[], int length, int i) { //arr, 10, 4
        int left = 2*i + 1, right = 2*i + 2; // 자식들 9 10
        int temp; 
        int largest = i; // 자기자신
        
        if( left<length && arr[left]>arr[largest]) largest = left;  // left = 9, largest의 자식노드
        if( right<length && arr[right]>arr[largest]) largest = right; //없으므로 X
        
        if( largest != i ) { // 본인 값이 4가 아니면 두개를 바꿔준다.
            temp = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = temp;
            heapify(arr, length, largest); // arr, 10, 9
        }
    }
    private static void heapSort(int arr[]) {
        int i, temp, length = arr.length;
        for(i=length/2-1; i>=0; i--)  //4 3 2 1 0 
        	heapify(arr, length, i); // 자식을 가지는 첫번째 노드가 length /2 에 있기때문에 이보다 큰 것은 heapify를 할 필요가 없다.
        
        ////여기까지가 이진 정렬
        
        //힙정렬
        for(i=length-1; i>=0; i--) {
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
