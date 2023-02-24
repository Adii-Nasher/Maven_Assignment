package com.knoldus;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testReverseString() {
        StringUtils stringUtils = new StringUtils();

        // Test case 1: Reverse an empty string
        Assert.assertEquals("", stringUtils.reverseString(""));

        // Test case 2: Reverse a string with only one character
        Assert.assertEquals("a", stringUtils.reverseString("a"));

        // Test case 3: Reverse a string with multiple characters
        Assert.assertEquals("cba", stringUtils.reverseString("abc"));

        // Test case 4: Reverse a string with whitespace characters
        Assert.assertEquals("   edcba", stringUtils.reverseString("abcde   "));
    }

    @Test
    public void testGetStringLength() {
        StringUtils stringUtils = new StringUtils();

        // Test case 1: Get the length of an empty string
        Assert.assertEquals(0, stringUtils.getStringLength(""));

        // Test case 2: Get the length of a string with only one character
        Assert.assertEquals(1, stringUtils.getStringLength("a"));

        // Test case 3: Get the length of a string with multiple characters
        Assert.assertEquals(5, stringUtils.getStringLength("hello"));

        // Test case 4: Get the length of a string with whitespace characters
        Assert.assertEquals(6, stringUtils.getStringLength("  hello"));
    }
}


