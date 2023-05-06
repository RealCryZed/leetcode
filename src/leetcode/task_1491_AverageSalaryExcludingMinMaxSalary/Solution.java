package leetcode.task_1491_AverageSalaryExcludingMinMaxSalary;

public class Solution {

    public static void main(String[] args) {
        System.out.println(average(new int[]{4000,3000,1000,2000}));
        System.out.println(average(new int[]{1000,2000,3000}));
        System.out.println(average(new int[]{4000,3000,1000,2001}));
    }

    public static double average(int[] salary) {
        double salaryNum = 0;
        int minSalary = Integer.MAX_VALUE, maxSalary = Integer.MIN_VALUE;
        for(int i = 0; i < salary.length; i++) {
            salaryNum += salary[i];
            if (salary[i] < minSalary) minSalary = salary[i];
            if (salary[i] > maxSalary) maxSalary = salary[i];
        }
        return (salaryNum - minSalary - maxSalary) / (salary.length - 2);
    }
}
