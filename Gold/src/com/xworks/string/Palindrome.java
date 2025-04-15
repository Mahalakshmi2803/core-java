package com.xworks.string;

public class Palindrome {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
        return count;

    }
    public static int countCharacters(String str) {
        return getLength(str);
    }
    public static boolean isPalindrome(String str) {
        int len = getLength(str);
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Palindrome " + isPalindrome("malayalam"));

    }
}
