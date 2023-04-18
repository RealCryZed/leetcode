package leetcode.task_1768_MergeStringsAlternately;

import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();

        LinkedList<Character> firstWord = new LinkedList<>();
        LinkedList<Character> secondWord = new LinkedList<>();

        for (char ch : word1.toCharArray()) {
            firstWord.add(ch);
        }
        for (char ch : word2.toCharArray()) {
            secondWord.add(ch);
        }

        while (!firstWord.isEmpty() && !secondWord.isEmpty()) {
            stringBuilder.append(firstWord.pollFirst());
            stringBuilder.append(secondWord.pollFirst());
        }

        if (firstWord.isEmpty()) {
            while (!secondWord.isEmpty()) stringBuilder.append(secondWord.pollFirst());
        } else {
            while (!firstWord.isEmpty()) stringBuilder.append(firstWord.pollFirst());
        }

        return stringBuilder.toString();
    }
}
