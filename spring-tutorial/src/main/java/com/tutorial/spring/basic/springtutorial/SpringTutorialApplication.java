package com.tutorial.spring.basic.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
//		System.out.println(binarySearch.binarySearch(new int[] { 1, 2, 15, 89, 19, 23 }, 15));
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringTutorialApplication.class, args);
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch.binarySearch(new int[] { 1, 2, 15, 89, 19, 23 }, 15));
		
	}

}

