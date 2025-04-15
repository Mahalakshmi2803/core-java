package com.xworks.string;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void wordFrequency(String str) {
        String[] words = str.split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println ();
    wordFrequency(sentence);
    }
}
