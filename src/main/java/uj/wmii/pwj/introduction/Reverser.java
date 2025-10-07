package uj.wmii.pwj.introduction;

public class Reverser {

    public String reverse(String input) {
        if (input == null) return null;
        String trimmed = input.trim();
        StringBuilder reversed = new StringBuilder(trimmed);
        return reversed.reverse().toString();
    }

    public String reverseWords(String input) {
        if (input == null) return null;
        String trimmed = input.trim();
        String[] words = trimmed.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) reversed.append(" ");
        }
        return reversed.toString();
    }
}