class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int arrSum = 0;
        for(int i = 0 ; i < n ; i++){
            arrSum += nums[i];
        }
        int maxBest = nums[0];
        int minBest = nums[0];
        int ans = nums[0];
        for(int i = 1 ; i < n ; i++){
            maxBest = Math.max(maxBest + nums[i] , nums[i]);
            minBest = Math.min(minBest + nums[i] , nums[i]);
            if((arrSum - minBest) == 0){
                ans = Math.max(ans , maxBest);
                continue;
            }
            ans = Math.max(ans , Math.max(maxBest , arrSum - minBest));
        }
        return ans;
    }
}