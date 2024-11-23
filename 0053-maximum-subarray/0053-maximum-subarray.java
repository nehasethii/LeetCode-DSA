class Solution {
    public int maxSubArray(int[] nums) {
        // int max = nums[0];
        // int sum = 0;
        // for(int i = 0 ; i < nums.length ; i++)
        // {
        //     sum += nums[i];
        //     max = (sum > max) ? sum : max;
        //     if(sum < 0)
        //         sum = 0;
        // }
        // return max;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum = Math.max(sum + nums[i] , nums[i]);
            max = Math.max(sum,max);
        }
        return max;
    }
}