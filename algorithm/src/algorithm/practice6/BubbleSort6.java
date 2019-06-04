package algorithm.practice6;

public class BubbleSort6 {

	public void sort(int[]a) {
		for(int i = 0; i<a.length-1; i++) {
			for(int j =0; j<a.length-i-1; j++) {
				if(a[j+1] < a[j])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
