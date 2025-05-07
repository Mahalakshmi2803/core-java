package com.xworks.string;

public class CountAlpha {
    public static void main(String[] args) {


        String input = "Today is my day, I will do best";
        int v_count = 0;
        int c_count = 0;
        for (int i = 0; i <input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'E' ||
                    input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U' ||
                    input.charAt(i) == 'a' || input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' || input.charAt(i) == '0' || input.charAt(i) == 'u') {
                v_count++;
            }
            c_count++;
        }


        System.out.println("Vowels" + v_count + "Consonants" + c_count);

    }
}