package com.xworks.string;

public class NumberOfCharacters {
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

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Character Count: " + countCharacters(sentence));
    }
}
