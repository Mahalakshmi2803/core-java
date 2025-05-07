package com.xworks.string;

public class RcbMatch {

        public static void main(String[] args) {
            String input = "RCB will win the match";
            String[] words = input.split(" ");


            if (words.length >= 2) {

                char[] chars = words[1].toCharArray();
                int left = 0, right = chars.length - 1;
                while (left < right) {

                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
                words[1] = new String(chars);
            }



            String output = "";
            for (int i = 0; i < words.length; i++) {
                output += words[i];
                if (i < words.length - 1) {
                    output += " ";
                }
            }

            System.out.println("Output: " + output);
        }
    }

