class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[Math.abs(nums[i])] > 0){
                nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
            }
            else{
                return Math.abs(nums[i]);
            }
        }
        return -1;
    }
}