package leetcode.task_13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("MMCMXCIV"));
    }

    public static int romanToInt(String s) {
        int answer = 0;
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for (int i = 0; i < s.length(); i++) {
            int nextElement = 0;
            if (!(i + 1 == s.length())) nextElement = map.get(s.charAt(i+1));

            int curElement = map.get(s.charAt(i));
            if (nextElement <= curElement) answer += curElement;
            else {
                answer += nextElement - curElement;
                i++;
            }
        }

        return answer;
    }
}
