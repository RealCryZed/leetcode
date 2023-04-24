package leetcode.NOT_SOLVED_task_29_DivideTwoIntegers;

public class Solution {

    public static void main(String[] args) {
        //3
        System.out.println(divide(10, 3));
        //-3
        System.out.println(divide(-10, 3));
        //-2
        System.out.println(divide(7, -3));
        //0
        System.out.println(divide(0, -3));
        // 1
        System.out.println(divide(1, 1));
        // 2
        System.out.println(divide(2, 1));
        // 0
        System.out.println(divide(1, 2));
        // 2147483647
        System.out.println(divide(Integer.MIN_VALUE, -1));
        // -2147483647
        System.out.println(divide(Integer.MAX_VALUE, -1));
        // -2147483648
        System.out.println(divide(Integer.MIN_VALUE, 1));
        // 2147483647
        System.out.println(divide(Integer.MAX_VALUE, 1));

        // 0
        System.out.println(divide(-1, Integer.MIN_VALUE));
        // 0
        System.out.println(divide(1, Integer.MAX_VALUE));
        // 0
        System.out.println(divide(1, Integer.MIN_VALUE));
        // 0
        System.out.println(divide(-1, Integer.MAX_VALUE));

        // -1
        System.out.println(divide(Integer.MIN_VALUE, Integer.MAX_VALUE));


        System.err.println("\n" + Integer.MIN_VALUE +
                            "\n" + Integer.MAX_VALUE);
    }

    public static int divide(int dividend, int divisor) {
        int counter = 0;

        while (Math.abs(dividend) >= Math.abs(divisor)) {
            if ((dividend < 0 && divisor > 0) || (dividend >= 0 && divisor < 0)) {
                dividend += divisor;
                counter--;
            } else {
                dividend -= divisor;
                counter++;
            }
        }

        return counter;
    }
}
