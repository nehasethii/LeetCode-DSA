class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxConsecutiveOnes = Integer.MIN_VALUE;
        int left = 0, right = 0;
        int zeros = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zeros++;
            }
            if(zeros <= k){
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes , right + 1 - left);
            }
            else if(zeros > k){
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