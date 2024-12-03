package com.linexperts.palindromo.service;


import com.linexperts.palindromo.model.PalindromeRequest;
import com.linexperts.palindromo.model.PalindromeResponse;
import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public PalindromeResponse analyzeString(PalindromeRequest request) {
        String input = request.getPalindromo();
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("Input string cannot be null or blank");
        }

        int lengthCadena = input.length();
        String sanitized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = new StringBuilder(sanitized).reverse().toString().equals(sanitized);
        int isPalindromo = isPalindrome ? 1 : 0;
        int lengthCaracteresEspeciales = input.length() - sanitized.length();

        return new PalindromeResponse(lengthCadena, isPalindromo, lengthCaracteresEspeciales);
    }
}