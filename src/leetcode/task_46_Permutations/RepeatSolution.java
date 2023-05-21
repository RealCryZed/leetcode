package leetcode.REPEAT_task_46_Permutations;

import java.util.ArrayList;
import java.util.List;

public class RepeatSolution {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
//        System.out.println(permute(new int[]{0,1}));
//        System.out.println(permute(new int[]{1}));
//        24 разных
//        System.out.println(permute(new int[]{5,7,9,11}));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0,finalList, list, nums);
        return finalList;
    }

    public static void helper(int index, List<List<Integer>> finalList, List<Integer> list, int[] nums) {
        if (index == nums.length-1) {
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            finalList.add(new ArrayList<>(list));
            list.clear();
        } else {
            for (int i = index; i < nums.length; i++) {
                swap(index, i, nums);
                helper(index+1, finalList, list, nums);
                swap(index, i, nums);
            }
        }
    }

    public static void swap(int start, int end, int[] a) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }
}
