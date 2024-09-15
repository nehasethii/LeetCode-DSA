class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(result[1] != -1)
                break;
            if(result[0] == -1 && nums[i] == target)
                result[0] = i;
            if(result[0] != -1 && nums[i] != target)
                result[1] = i - 1;
        }
        if(nums.length > 0 && nums[nums.length - 1] == target)
            result[1] = nums.length - 1;
        return result;
    }
}