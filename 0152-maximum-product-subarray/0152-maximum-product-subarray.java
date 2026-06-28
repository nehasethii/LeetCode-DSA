class Solution {
    public int maxProduct(int[] nums) {
        int maxBest = nums[0];
        int minBest = nums[0];
        int ans = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int c1 = maxBest * nums[i];
            int c2 = minBest * nums[i];
            maxBest = Math.max(nums[i] , Math.max(c1,c2));
            minBest = Math.min(nums[i] , Math.min(c1,c2));
            ans = Math.max(ans , maxBest);
        }
        return ans;
    }
}