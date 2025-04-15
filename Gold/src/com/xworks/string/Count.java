package com.xworks.string;

public class Count {

    public static int countWords(String str) {
        int wordCount = 0;
        boolean inWord = false;
        try {
            int i = 0;
            while (true) {
                char c = str.charAt(i);
                if (c != ' ' && !inWord) {
                    wordCount++;
                    inWord = true;
                } else if (c == ' ') {
                    inWord = false;
                }
                i++;
            }
        } catch (Exception e) {
            // End of string
        }
        return wordCount;
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Word Count: " + countWords(sentence));
    }
}
