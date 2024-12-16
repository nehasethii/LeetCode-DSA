class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int count = 0 ; count < k ; count++)
        {
            int index = 0;
            for(int i = nums.length - 1 ; i > 0 ; i--)
            {
                if((nums[i] < nums[index])){
                    index = i;
                }
                else if(nums[i] == nums[index])
                {
                    index = Math.min(i,index);
                }
            }
            nums[index] *= multiplier;
        }
        return nums;
    }
}