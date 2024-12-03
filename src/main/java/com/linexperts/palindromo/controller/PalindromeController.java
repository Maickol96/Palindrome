package com.linexperts.palindromo.controller;


import com.linexperts.palindromo.model.PalindromeRequest;
import com.linexperts.palindromo.model.PalindromeResponse;
import com.linexperts.palindromo.service.PalindromeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/palindrome")
@Tag(name = "Palindrome Controller", description = "API to evaluate if a string is a palindrome and analyze its properties")
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @PostMapping
    @Operation(summary = "Evaluate palindrome", description = "Receives a string and returns its length, if it's a palindrome, and the count of special characters.")
    public ResponseEntity<PalindromeResponse> evaluatePalindrome(@RequestBody PalindromeRequest request) {
        PalindromeResponse response = palindromeService.analyzeString(request);
        return ResponseEntity.ok(response);
    }
}
