class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int maxProd = nums[0];
        int minProd = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            int c1 = minProd * nums[i];
            int c2 = maxProd * nums[i];
            maxProd = Math.max(nums[i] , Math.max(c1,c2));
            minProd = Math.min(nums[i] , Math.min(c1,c2));
            ans = Math.max(ans ,maxProd);
        }
        return ans;
    }
}