package com.xworks.string;

public class ReverseString{


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

    public static String reverseString(String str) {
        int len = getLength(str);
        StringBuilder rev = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        String sentence = "Hello World";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed: " + reverseString(sentence));
    }



    }

