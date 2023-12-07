package org.example.tcsnqt.string;

public class LargestWord {
    public static void main(String[] args) {
        String s = "Google docs welcome";
        String[] words = s.split(" ");
        String max = "";
        for (String word : words)
            if (word.length() > max.length()) {
                max = word;
            }
        System.out.println(max);
    }
}

