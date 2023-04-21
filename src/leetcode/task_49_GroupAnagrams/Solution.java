package leetcode.task_49_GroupAnagrams;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
//        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
//        System.out.println(groupAnagrams(new String[]{"a"}));
//        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"", ""}));
        System.out.println(groupAnagrams(new String[]{"", "b"}));
//        System.out.println(groupAnagrams(new String[]{"", "b", ""}));
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


//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String, String> mapOfWords = new HashMap<>();
//        Map<String, ArrayList<String>> mapMap = new HashMap<>();
//
//        char[][] words = new char[strs.length][];
//        for (int i = 0; i < strs.length; i++) {
//            words[i] = strs[i].toCharArray();
//            Arrays.sort(words[i]);
//            mapOfWords.put(strs[i], String.valueOf(words[i]));
//
//            ArrayList<String> list = mapMap.getOrDefault( String.valueOf(words[i]),
//                    new ArrayList<String>() );
//            list.add(strs[i]);
//            System.err.println(list);
//        }
//
//        Map<String, List<String>> map = new HashMap<>();
//        for (Map.Entry<String, String> pair : mapOfWords.entrySet()) {
//            map.computeIfAbsent(pair.getValue(), k -> new ArrayList<>()).add(pair.getKey());
//        }
//
//        return new ArrayList<>(map.values());
//    }
}
