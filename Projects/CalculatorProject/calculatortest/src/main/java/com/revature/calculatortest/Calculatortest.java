package com.revature.calculatortest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//need Number13Exception functionality but for here

* 1 - subtract two integers - throw exception i.e. 5-3 = 2 | use for test
* 2 - multiply two integers - throw exception i.e. 2 * 4 = 8 | use for test
* 3 - add two integers - throw exception i.e. 2 + 3 = 5 | use for test
* 4 - divide two integers - throw exception i.e. 4/2 = 2 | use for test

public class Calculatortest {
	
	@Test
	public subtractTest() {
		Calculator calculator = new Calculator();
		int result = calculator.subtract(5,3);
		Assert.assertEquals(result,2);
	}
	
	@Test
	public addTest() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		Assert.assertEquals(result,5);
	}
	
	@Test
	public multiplyTest() {
		Calculator calculator = new Calculator();
		int result = calculator.multiply(2, 4);
		Assert.assertEquals(result,8);
	}
	//add @Test for Divide with special case, ran out of time
}
