class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length = Integer.MAX_VALUE;
        int low = 0 , high = 0;
        int sum = 0;
        while(high < nums.length){
            sum += nums[high];
            while(sum >= target){
                length = Math.min(length,(high - low + 1));
                low++;
                sum -= nums[low - 1];
            }
            high++;
        }
        return (length == Integer.MAX_VALUE) ? 0 : length;
    }
}