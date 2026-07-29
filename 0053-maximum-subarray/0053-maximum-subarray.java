class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int num = nums[i];
            sum = Math.max(sum + num,num);
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}