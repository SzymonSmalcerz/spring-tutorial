package com.tutorial.spring.basic.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
		System.out.println(binarySearch.binarySearch(new int[] { 1, 2, 15, 89, 19, 23 }, 18));
		SpringApplication.run(SpringTutorialApplication.class, args);
	}

}

