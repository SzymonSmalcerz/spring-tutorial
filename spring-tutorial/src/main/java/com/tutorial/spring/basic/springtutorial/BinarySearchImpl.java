package com.tutorial.spring.basic.springtutorial;

public class BinarySearchImpl {
	
	private Sortable sortable;
	
	public BinarySearchImpl(Sortable sortable) {
		this.sortable = sortable;
	}

	public int binarySearch(int[] numbers, int numToFind) {
		numbers = this.sortable.sort(numbers);
		int index = -1;
		int low = 0;
		int high = numbers.length;
		while(low <= high) {
			index = (int) Math.ceil((low + high)/2);
			if(numbers[index] == numToFind) {
				return index;
			} else if(numbers[index] > numToFind) {
				high = index - 1;
			} else {
				low = index + 1;
			}
		}
		// not found
		return -1;
	}
	
}
