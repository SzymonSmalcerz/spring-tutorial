package com.tutorial.spring.basic.springtutorial;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements Sortable {

	@Override
	public int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}

}
