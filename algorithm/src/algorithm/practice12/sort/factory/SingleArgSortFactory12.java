package algorithm.practice12.sort.factory;

import algorithm.practice12.sort.sort.Sortable;
import algorithm.practice12.sort.sortImpl.BubbleSort12;
import algorithm.practice12.sort.sortImpl.HeapSort12;
import algorithm.practice12.sort.sortImpl.InsertionSort12;
import algorithm.practice12.sort.sortImpl.SelectionSort12;

public class SingleArgSortFactory12 extends SortFactory12{

	@Override
	public Sortable createSort12(String sortType) {
		if(sortType.equalsIgnoreCase("BS")) {
			return new BubbleSort12();
		} else if(sortType.equalsIgnoreCase("SS")) {
			return new SelectionSort12();
		} else if(sortType.equalsIgnoreCase("IS")) {
			return new InsertionSort12();
		} else if(sortType.equalsIgnoreCase("HS")) {
			return new HeapSort12();
		}
		
		return null;
	}

}
