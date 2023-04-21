package leetcode.task_49_GroupAnagrams;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        System.out.println(groupAnagrams(new String[]{"a"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"", ""}));
        System.out.println(groupAnagrams(new String[]{"", "b"}));
        System.out.println(groupAnagrams(new String[]{"", "b", ""}));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map <String, ArrayList<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String wordInString = new String(word);

            ArrayList<String> list = map.getOrDefault(wordInString, new ArrayList<>());

            list.add(str);
            map.put(wordInString, list);
        }

        List<List<String>> listOfString = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> pair : map.entrySet()) {
            listOfString.add(pair.getValue());
        }

        return listOfString;
    }

    /**
     * Почти правильное решение. Единственное, что считает неправильно - анаграмму ["",""]
     * Output = [[]]
     * Expected = [[""],[""]]
     */

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, List<String>> map = new HashMap<>();
//        Map<String, String> mapOfWords = new HashMap<>();
//
//        char[][] words = new char[strs.length][];
//
//        for (int i = 0; i < strs.length; i++) {
//            words[i] = strs[i].toCharArray();
//            Arrays.sort(words[i]);
//            mapOfWords.put(strs[i], String.valueOf(words[i]));
//        }
//
//        for (Map.Entry<String, String> pair : mapOfWords.entrySet()) {
//            map.computeIfAbsent(pair.getValue(), k -> new ArrayList<>()).add(pair.getKey());
//        }
//
//        return new ArrayList<>(map.values());
//    }
}
