class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length + 1;
        int sum = 0;
        int low = 0;
        int high = 0;
        for(high = 0 ; high < nums.length ; high++){
            sum += nums[high];
            while(sum >= target){
                len = Math.min(len,high - low + 1);
                sum -= nums[low];
                low++;
            }
        }
        return len <= nums.length ? len : 0;
    }
}