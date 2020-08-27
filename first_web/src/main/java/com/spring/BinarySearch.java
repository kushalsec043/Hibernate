package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

@Controller
@RestController
public class BinarySearch 
{
	// Tight coupling....
	@Autowired
	@Qualifier("bubble")
	Sortalgo sort;

	//@GetMapping("/binary")
	public int binarysearch(int[] numbers)
	{
		sort.sort(numbers);
		return 3;
	}
	
	public void execute(@RequestParam(defaultValue="ghdhfj") String id)
	{
		
	}
	
}
