package algorithm.practice9.search;

public class SequentialSearch {

	public int search(String se,String[] arr) {
		for(int i = 0; i<arr.length;i++) {
			if(arr[i].equals(se)) return i;
		}
		return -1;
	}

	
}
