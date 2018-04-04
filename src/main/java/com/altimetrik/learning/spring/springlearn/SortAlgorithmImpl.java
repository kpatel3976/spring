package com.altimetrik.learning.spring.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SortAlgorithmImpl {

	@Autowired
	@Qualifier("merge")
	private SortAlgorithm quickSortAlgorithm;
	
	public boolean search(int[] numbers, int numberToSearch) {
		return quickSortAlgorithm.search(numbers, numberToSearch);
	}
}