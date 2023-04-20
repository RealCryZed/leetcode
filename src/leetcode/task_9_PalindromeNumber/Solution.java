package leetcode.task_9_PalindromeNumber;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        String str = String.valueOf(x);

        if (str.length() == 1) return true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }

        return true;
    }
}
