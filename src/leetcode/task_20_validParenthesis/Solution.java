package leetcode.task_20_validParenthesis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("{([])}"));
        System.out.println(isValid("({})([])"));
        System.out.println(isValid("({}){()}"));
        System.out.println(isValid("({})[()]"));
        //false
        System.out.println(isValid("({)}{()}"));
        //false
        System.out.println(isValid("["));
        //false
        System.out.println(isValid("(("));
        //false
        System.out.println(isValid("("));
        //false
        System.out.println(isValid(")"));
        //false
        System.out.println(isValid("]]]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() == 1) return false;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (stack.size() == 0 || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.size() == 0 || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.size() == 0 || stack.pop() != '[') return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
