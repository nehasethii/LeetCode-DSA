class Solution {
    public int longestSubarray(int[] nums) {
        int maxConsecutiveOnes = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int zeros = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeros++;
            }
            if(zeros <= 1){
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes , right - left);
            }
            else if(zeros > 1){
                if(nums[left] == 0)
                    zeros--;
                left++;
            }
            right++;
        }
        if(maxConsecutiveOnes < 0)
            return 0;
        return maxConsecutiveOnes;
    }
}