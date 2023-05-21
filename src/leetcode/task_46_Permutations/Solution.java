package leetcode.task_46_Permutations;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
        System.out.println(permute(new int[]{0,1}));
        System.out.println(permute(new int[]{1}));
//        24 разных
        System.out.println(permute(new int[]{5,7,9,11}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, list, result, nums);
        return result;
    }

    private static void helper(int index, List<Integer> list, List<List<Integer>> finalList, int[] nums) {
        if (index == nums.length - 1) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            helper(index + 1, list, finalList, nums);
            swap(i, index, nums);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
