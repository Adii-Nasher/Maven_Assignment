package com.knoldus;
// Following clean-code principles
public class StringUtils {

    public String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int leftIndex = 0;
        int rightIndex = charArray.length - 1;
        while (leftIndex < rightIndex) {
            char temp = charArray[leftIndex];
            charArray[leftIndex] = charArray[rightIndex];
            charArray[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
        return new String(charArray);
    }

    public int getStringLength(String str) {
        if (str == null) {
            return 0;
        }
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
}

