package com.altimetrik.learning.spring.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLearnApplication.class, args);
		SortAlgorithmImpl sortAlgorithmImpl = applicationContext.getBean(SortAlgorithmImpl.class);
		System.out.println(sortAlgorithmImpl);
		boolean result = sortAlgorithmImpl.search(new int[] {1, 2, 3}, 2);
		System.out.println(result);
	}
}