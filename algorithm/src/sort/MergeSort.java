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
			mergeSort(a,l,middle);	//�ϳ��� �ɶ����� �迭�� ��� �ɰ���.
			mergeSort(a,middle+1,r);	// �ϳ��� �ɶ����� �迭�� ��� �ɰ���.
			merge(a,l,middle,r);
		}
	}
	
	public static void merge(int[] a, int l,int middle, int r) {
		//�� �迭�� ��ģ��.
		int i = l;
		int j = middle+1;
		int k =l;//�ӽ� �迭�� ����Ű��
		
		int[] temp = new int[a.length];
		while(i<=middle && j<=r) { // �ΰ��� ������ �� ���¿��� ������ �߰�����, ������ �߰� +1 ���� ������
			if(a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				temp[k++] = a[j++];
			}
		}
			
		while(i <= middle ) { // j<=r�� ���� ������� (���� k�迭�� �ڸ��� �� �������� ���) ������ i���� ���ʷ� ����ִ´�. 
			temp[k++] = a[i++];
		}
		while( j<=r) { //���������� i<=middle�� �����������
			temp[k++]= a[j++];
		}
		
		for(int index = l; index< k; index++) {
			a[index] =temp[index];
		}
	}
}
