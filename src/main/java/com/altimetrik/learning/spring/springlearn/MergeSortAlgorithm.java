package com.altimetrik.learning.spring.springlearn;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merge")
public class MergeSortAlgorithm implements SortAlgorithm {
	@Override
	public boolean search(int[] numbers, int numberToSearch) {
		return true;
	}
}