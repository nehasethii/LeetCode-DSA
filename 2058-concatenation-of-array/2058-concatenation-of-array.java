import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = in.nextInt();
        }
        int[] ans = sol.getConcatenation(nums);
        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.print(ans[i] + " ");
        }
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            ans[i] = nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}