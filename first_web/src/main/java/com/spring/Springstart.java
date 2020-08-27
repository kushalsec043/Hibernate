package com.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@Configuration

@RestController
public class Springstart 
{
	
	public static void main(String[] args)
	{
		BinarySearch binary = new BinarySearch();
		int[] numbers = {1,2,3,4};
		
		System.out.println(binary.binarysearch(numbers));
	}
}
