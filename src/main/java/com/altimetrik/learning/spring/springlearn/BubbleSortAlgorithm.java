package com.altimetrik.learning.spring.springlearn;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {
	@Override
	public boolean search(int[] numbers, int numberToSearch) {
		return true;
	}
}