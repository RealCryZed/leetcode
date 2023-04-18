package leetcode.task_234_Palindrome;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    // 1 2 3 4 3 2 1

    public boolean isPalindrome(ListNode head) {
        if (head == null && head.next == null) return true;

        ListNode slow = head;
        ListNode faster = head;

        Stack<Integer> stack = new Stack<>();

        while (faster != null && faster.next != null) {
            stack.push(slow.val);
            slow = slow.next;
            faster = faster.next.next;

            if (faster == null || faster.next == null) {
                if (faster != null) slow = slow.next;
                while (!stack.isEmpty() || slow != null) {
                    if (stack.pop() != slow.val) {
                        return false;
                    }
                    slow = slow.next;
                }
            }
        }

        return true;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
  }
}
