package com.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Primary
@Qualifier("quick")
@Repository

public class Quicksort implements Sortalgo
{

	@Override
	public int[] sort(int[] numbers) 
	{
		System.out.println("Quick sort Implemented");
		return numbers;
	}
	
}
