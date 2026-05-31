class Solution {
    public int removeDuplicates(int[] nums) {
        int low = 1 , high = 1;
        int count = 1;
        while(high < nums.length){
            if(nums[high] == nums[high - 1]){
                high++;
            }
            else{
                nums[low] = nums[high];
                low++;
                count++;
                high++;
            }
        }
        return count;
    }
}