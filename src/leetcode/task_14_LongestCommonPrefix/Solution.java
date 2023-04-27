package leetcode.task_14_LongestCommonPrefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"car","racecar",""}));
        System.out.println(longestCommonPrefix(new String[]{"car","car","car"}));
        System.out.println(longestCommonPrefix(new String[]{"flower","flower","flower"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].equals("")) return "";

        String prefix = "";

        for (int i = 1; i < strs[0].length()+1; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (prefix.length() + 1 > strs[j].length()) return prefix;
                if (!strs[j].substring(0, i).equals(strs[0].substring(0, i))) return prefix;
            }
            prefix = strs[0].substring(0, i);
        }

        return prefix;
    }
}
