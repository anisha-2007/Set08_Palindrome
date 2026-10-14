package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPalindromeNumber() {
        assertTrue(App.isPalindrome(121));
    }

    @Test
    public void testNonPalindromeNumber() {
        assertFalse(App.isPalindrome(123));
    }

    @Test
    public void testSingleDigit() {
        assertTrue(App.isPalindrome(7));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(App.isPalindrome(-121));
    }

    @Test
    public void testZero() {
        assertTrue(App.isPalindrome(0));
    }
}