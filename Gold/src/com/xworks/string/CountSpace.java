package com.xworks.string;

public class CountSpace {
    public static int countSpaces(String str) {
        int count = 0;
        try {
            int i = 0;
            while (true) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
                i++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Space Count: " + countSpaces(sentence));
    }
}
