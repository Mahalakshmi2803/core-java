package com.xworks.string;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void charFrequency(String str) {
        Map<Character, Integer> freq = new HashMap<>();
        try {
            int i = 0;
            while (true) {
                char c = str.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
                i++;
            }
        } catch (Exception e) {
        }
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println();
        charFrequency(sentence);
    }
}
