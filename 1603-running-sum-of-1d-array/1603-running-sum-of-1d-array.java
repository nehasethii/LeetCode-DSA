import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = in.nextInt();
        }
        int[] runningSum = sol.runningSum(nums);
        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(runningSum[i] + " ");
        }
    }
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int i , j;
        for (i = 0; i < nums.length; i++)
        {
            int sum = 0;
            for (j = 0; j <= i; j++)
            {
                sum += nums[j];
            }
            runningSum[j-1] = sum;
        }
        return runningSum;
    }
}
