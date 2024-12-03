package com.linexperts.palindromo.service;

import com.linexperts.palindromo.model.PalindromeRequest;
import com.linexperts.palindromo.model.PalindromeResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

	private final PalindromeService palindromeService = new PalindromeService();

	@Test
	void testAnalyzeString_withPalindrome() {
		PalindromeRequest request = new PalindromeRequest();
		request.setPalindromo("anita lava la tina");

		PalindromeResponse response = palindromeService.analyzeString(request);

		assertEquals(18, response.getLengthCadena());
		assertEquals(1, response.getIsPalindromo());
		assertEquals(3, response.getLengthCaracteresEspeciales());
	}

	@Test
	void testAnalyzeString_withNonPalindrome() {
		PalindromeRequest request = new PalindromeRequest();
		request.setPalindromo("hello world");

		PalindromeResponse response = palindromeService.analyzeString(request);

		assertEquals(11, response.getLengthCadena());
		assertEquals(0, response.getIsPalindromo());
		assertEquals(1, response.getLengthCaracteresEspeciales());
	}

	@Test
	void testAnalyzeString_withSpecialCharacters() {
		PalindromeRequest request = new PalindromeRequest();
		request.setPalindromo("A man, a plan, a canal, Panama!");

		PalindromeResponse response = palindromeService.analyzeString(request);

		assertEquals(31, response.getLengthCadena());
		assertEquals(1, response.getIsPalindromo());
		assertEquals(10, response.getLengthCaracteresEspeciales());
	}

	@Test
	void testAnalyzeString_withEmptyString() {
		PalindromeRequest request = new PalindromeRequest();
		request.setPalindromo("");

		Exception exception = assertThrows(IllegalArgumentException.class, () ->
				palindromeService.analyzeString(request)
		);

		assertEquals("Input string cannot be null or blank", exception.getMessage());
	}

	@Test
	void testAnalyzeString_withNullString() {
		PalindromeRequest request = new PalindromeRequest();
		request.setPalindromo(null);

		Exception exception = assertThrows(IllegalArgumentException.class, () ->
				palindromeService.analyzeString(request)
		);

		assertEquals("Input string cannot be null or blank", exception.getMessage());
	}
}
