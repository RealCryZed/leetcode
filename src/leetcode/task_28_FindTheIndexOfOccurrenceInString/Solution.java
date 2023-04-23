package leetcode.task_28_FindTheIndexOfOccurrenceInString;

public class Solution {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("mississippi", "issipi"));
        System.out.println(strStr("mississippi", "ississippi"));
        System.out.println(strStr("mississippi", "ssissippii"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        int result = -1;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && needle.length() <= haystack.length() - i) {
                int counter = 0;
                for (int j = i; j < needle.length() + i; j++) {
                    result = i;
                    if (haystack.charAt(j) != needle.charAt(counter)) {
                        result = -1;
                        break;
                    }
                    counter++;
                    if (counter == needle.length()) return result;
                }
            }
        }

        return result;
    }
}
