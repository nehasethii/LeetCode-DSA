class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[Math.abs(nums[i])] < 0)
                return Math.abs(nums[i]);
            nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
        }
        return 0;
    }
}