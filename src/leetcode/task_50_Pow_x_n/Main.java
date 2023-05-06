package leetcode.task_50_Pow_x_n;

public class Main {

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
        if (x < -10000 || x > 10000) {
            return 0;
        }

        if (n == 0) return 1;

        if (n < 0)  {
            x = 1 / x;
            n = n * -1;
        }

        if (n % 2 == 0) {
            x = x * x;
            n = n / 2;
            x = myPow(x, n);
        } else {
            x = x * myPow(x, n-1);
        }

        return x;
    }
}
