package algorithm.programmers;

import java.util.Arrays;

public class StringSort {

		  public String solution(String s) {

		      char[] arr = s.toCharArray();
		      Arrays.sort(arr);

		      return new StringBuilder(new String(arr)).reverse().toString();
		  }
}
