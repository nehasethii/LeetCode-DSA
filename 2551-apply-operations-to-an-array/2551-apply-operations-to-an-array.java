class Solution {
    public int[] applyOperations(int[] nums) {
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int zeroIdx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(zeroIdx == -1 && nums[i] == 0)
                zeroIdx = i;
            if(zeroIdx != -1 && nums[i] != 0){
                nums[zeroIdx] = nums[i];
                nums[i] = 0;
                if(i - zeroIdx > 1)
                    zeroIdx++;
                else
                    zeroIdx = i;
            }
        }
        return nums;
    }
}