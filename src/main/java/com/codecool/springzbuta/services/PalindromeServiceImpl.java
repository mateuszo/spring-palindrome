package com.codecool.springzbuta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService {
    private PalindromeChecker checker;

    @Autowired
    public PalindromeServiceImpl(@Qualifier("palindromeCheckerReverse") PalindromeChecker palindromeChecker) {
        this.checker = palindromeChecker;
    }

    public String getResult(String input) {
        return input + (checker.isPalindrome(input) ? " is a palindrome." : " is not a palindrome.");
    }
}
