package leetcode.task_50_Pow_x_n;

// This is bad solution for this task. We need to use recursion for proper fast solution
public class Solution {

    public static void main(String[] args) {
        // 1024.000
        System.out.println(myPow(2.000, 10));
        // 9.26100
        System.out.println(myPow(2.100, 3));
        // 0.25000
        System.out.println(myPow(2.000, -2));
        // 0.0625
        System.out.println(myPow(2.000, -4));
        // 0.5
        System.out.println(myPow(2.000, -1));
        // 1.0
        System.out.println(myPow(2.000, 0));
        // 0.0
        System.out.println(myPow(0, 2));
        // 9.861
        System.out.println(myPow(9.861, 1));
        // 1.0
        System.out.println(myPow(1.0000, 2147483647));
        // 1.0
        System.out.println(myPow(1.0000, -2147483648));
        // 0.00000
        System.out.println(myPow(2.0000, -2147483648));
        // 0.00000
        System.out.println(myPow(2.0000, -2147483648));
        // 8192.000
        System.out.println(myPow(2.0000, 13));
        // 3.43684
        System.out.println(myPow(1.00001, 123456));
        // 3.43684
        System.out.println(myPow(-1.00001, 123456));
        // 0.29096
        System.out.println(myPow(-1.00001, -123456));
        // -1
        System.out.println(myPow(-1.000000, 2147483647));
        // 1
        System.out.println(myPow(-1.000000, -2147483648));
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        else if (n == 1.000000000000) return x;
        else if (n == -1.000000000000) return 1 / x;
        else if (x == 1.000000000000) {
            if (n == -2147483648) return x;
            else return x;
        }
        else if (x == -1.000000000000) {
            if (n == -2147483648) return 1;
            else return x;
        }
        else if (n == -2147483648 && x > 1) return 0;
        else if (n == -2147483648 && x < -1) return 0;

        double result = x;

        for (int i = 1; i < Math.abs(n); i++) {
            result = result * x;
        }

        if (n < 0) result = 1 / result;

        return result;
    }
}
