package com.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("bubble")

@Service
public class Bubblesort implements Sortalgo
{

	@Override
	public int[] sort(int[] numbers) 
	{
		System.out.println("Bubble sort Implemented");
		return numbers;
	}
}
