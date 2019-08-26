package algorithm.practice;

public class BubbleSortT {
	  public static void main(String[] args) {
	          int a[] = {7,10,1,8,3,5,2,9,4,6};
				
	          BubbleSort2 bSort = new BubbleSort2();
	          bSort.sort(a);

	          for(int x : a) 
	        	  System.out.print(x + " ");
	          
	      }
	    }
