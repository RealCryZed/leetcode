package leetcode.task_1_Sum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

    }

//    public int[] twoSum(int[] nums, int target) {
//        int[] answer = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = 1+i; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    answer[0] = i;
//                    answer[1] = j;
//                }
//            }
//        }
//        return answer;
//    }


    //  1,3,47,6
    //
    //  target = 9


    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer[0] = i;
                answer[1] = map.get(target - nums[i]);
                return answer;
            }
            map.put(nums[i], i);
        }

        return answer;
    }
}
