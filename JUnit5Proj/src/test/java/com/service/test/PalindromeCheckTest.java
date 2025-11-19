package com.service.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.service.PalindromeCheck;
  
class PalindromeCheckTest {

	@ParameterizedTest //to test for different parameters
	@ValueSource(strings = {"madam","radar","liril","racecar","Ruby"}) //during test it will takes one by one parameter and pass it to arguments
	void testIsPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actualResult = pc.isPalindrome(str);
		assertTrue(actualResult);
	}

}
