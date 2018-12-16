package com.tutorial.spring.basic.springtutorial;

import java.util.Arrays;

public class BubbleSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}

}
