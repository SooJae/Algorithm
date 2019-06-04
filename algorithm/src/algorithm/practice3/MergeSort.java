package algorithm.practice3;

public class MergeSort {

	public void sort(int[] a, int l, int r) {
		if (l < r) {
			int middle = (l + r) / 2;
			sort(a, l, middle);
			sort(a, middle + 1, r);
			merge(a, l, middle, r);
		}

	}

	public void merge(int[] a, int l, int m, int r) {
		int i = l;
		int j = m + 1;
		int k = l;
		int[] tmpArr = new int[a.length];

		while (i <= m && j <= r) {
			if (a[i] < a[j])
				tmpArr[k++] = a[i++];
			else
				tmpArr[k++] = a[j++];
		}
		while (i <= m) {
			tmpArr[k++] = a[i++];
		}

		while (j <= r) {
			tmpArr[k++] = a[j++];
		}

		for (int index = l; index < k; index++) {
			System.out.println("l:" + l + " k:" + k);
			a[index] = tmpArr[index];
		}
	}
}
