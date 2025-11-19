package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.service.EvenOrOdd;

class EvenOrOddTest {

	@ParameterizedTest
	@CsvSource(value= {"10,even","7,odd","12,even","15,odd"}) //pass comma separated value
	void testEvenOrOddNumber(Integer input, String expectedResult) //due to we have two args separated by comma then we have to use @CsvSource 
	{
		EvenOrOdd evo = new EvenOrOdd();
		String actualResult = evo.evenOrOddNumber(input);
		assertEquals(expectedResult, expectedResult);
	}

}
