package com.xworks.string;

public class Target {
    public static boolean isWordPresent(String sentence, String target) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        String target="World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println(" Is " + target + "Present: " + isWordPresent(sentence, target));
    }
}
