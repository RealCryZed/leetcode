package leetcode.task_26_RemoveDuplicatesFromSortedArray;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2}));
        System.out.println(removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicates(new int[] {-3,-1,0,0,0,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int counter = 0;
        for (Integer number : set) {
            nums[counter] = number;
            counter++;
        }

        return set.size();
    }
}
