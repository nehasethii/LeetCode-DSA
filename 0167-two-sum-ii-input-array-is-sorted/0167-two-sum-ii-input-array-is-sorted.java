class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 , j = nums.length - 1;
        while(i < j){
            if(target > nums[i] + nums[j]){
                i++;
            }
            else if(target < nums[i] + nums [j]){
                j--;
            }
            else{
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }
}