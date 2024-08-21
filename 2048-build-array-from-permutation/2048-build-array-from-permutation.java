import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution sol = new Solution();
        int[] nums = new int[6];
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = in.nextInt();
        }
        int[] resultantArray = sol.buildArray(nums);
        for(int i = 0 ; i < nums.length ; i++)
        {
            System.out.print(resultantArray[i] + " ");
        }
    }
    public int[] buildArray(int[] nums) {
        int[] resultantArray = new int[nums.length];
        for(int i = 0 ; i < resultantArray.length ; i++)
        {
            resultantArray[i] = nums[nums[i]];
        }
        return resultantArray;
    }
}