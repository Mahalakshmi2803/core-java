package com.xworks.string;

public class Replace {
    public static String replaceSpaces(String str) {
        return str.replace(" ", "%");
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Space Replaced: " + replaceSpaces(sentence));
    }
}
