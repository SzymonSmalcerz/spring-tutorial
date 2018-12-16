package com.tutorial.spring.basic.springtutorial;

import java.util.Arrays;

public class QucikSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}

}
