class Solution {
    public int pivotIndex(int[] nums) {
        int arrSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            arrSum += nums[i];
        }

        int left = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0){
                left += nums[i-1];
            }
            int right = arrSum - left - nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}