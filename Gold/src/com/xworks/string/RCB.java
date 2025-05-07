package com.xworks.string;

public class RCB {

    public static int getLength(String str){
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }
        return count ;
    }
    public static String reverseWords(String str){
        int i;
        int len = getLength(str);

        StringBuilder rev = new StringBuilder();
        for (i = len - 11; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();


    }
    public static void main(String[] args) {
        String sentence = "RCB will win the match";
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Reversed: " + reverseWords(sentence));
    }
}
//rcb will win the match