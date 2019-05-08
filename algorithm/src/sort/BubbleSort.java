package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {10,2,4,8,5,6,1,7,3,9};
		
		for(int i =0; i< a.length-1; i++ ) {
			boolean flag = false;
			for(int j = 0; j<a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int tmp = a[j];
					a[j]=a[j+1];
					a[j+1] = tmp;
					flag=true;
				}
			}
			if(!flag)
				break;
		}
		for(int x : a) {
			System.out.println(x);
		}
	}
}
