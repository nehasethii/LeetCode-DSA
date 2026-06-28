class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxBest = nums[0];
        int minBest = nums[0];
        int ans = Math.abs(nums[0]);
        for(int i = 1 ; i < n ; i++){
            maxBest = Math.max(maxBest + nums[i] , nums[i]);
            minBest = Math.min(minBest + nums[i] , nums[i]);
            ans = Math.max(ans , Math.max(Math.abs(maxBest) , Math.abs(minBest)));
        }
        return ans;
    }
}