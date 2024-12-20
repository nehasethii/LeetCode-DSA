class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            int idx = Math.abs(nums[i]);
            if(nums[idx] < 0)
                return idx;
            nums[idx] = -nums[idx];
        }
        return 0;
    }
}