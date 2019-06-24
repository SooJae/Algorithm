package algorithm.practice12.sort.factory;

import algorithm.practice12.sort.sort.SSort12;
import algorithm.practice12.sort.sort.Sortable;
import algorithm.practice12.sort.sortImpl.BubbleSort12;
import algorithm.practice12.sort.sortImpl.HeapSort12;
import algorithm.practice12.sort.sortImpl.InsertionSort12;
import algorithm.practice12.sort.sortImpl.SelectionSort12;

public class SingleArgSortFactory12 extends SortFactory12{

	@Override
	public SSort12 createSort12(String sortType) {
		switch(sortType) {
			
		case "bs":
			return new BubbleSort12();
		case "ss":
			return new SelectionSort12();
		case "is":
			return new InsertionSort12();
		case "hs":
			return new HeapSort12(); 
			
		}
		
		return null;
	}

}
