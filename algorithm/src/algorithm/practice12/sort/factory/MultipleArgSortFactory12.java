package algorithm.practice12.sort.factory;

import algorithm.practice12.sort.sort.MSort12;
import algorithm.practice12.sort.sortImpl.MergeSort12;
import algorithm.practice12.sort.sortImpl.QuickSort12;

public class MultipleArgSortFactory12 extends SortFactory12<MSort12> {

	@Override
	public MSort12 createSort12(String sortType) {
		switch(sortType) {
		
		case "ms":
			return new MergeSort12();
		case "qs":
			return new QuickSort12();
			
		}
		return null;
	}

}
