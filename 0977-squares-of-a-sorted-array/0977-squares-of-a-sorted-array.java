class Solution {
    public int[] sortedSquares(int[] nums) {
        int idx1 = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= 0){
                idx1 = i;
            }
        }
        if(idx1 < 0){
            for(int i = 0 ; i < nums.length ; i++){
                nums[i] = nums[i] * nums[i];
            }
            return nums;
        }
        else{
            int idx2 = idx1 + 1;
            int j = 0;
            int[] ans = new int[nums.length];
            while(idx1 >= 0 && idx2 < nums.length){
                if(nums[idx1] * nums[idx1] < nums[idx2] * nums[idx2]){
                    ans[j++] = nums[idx1] * nums[idx1];
                    idx1--;
                }
                else{
                    ans[j++] = nums[idx2] * nums[idx2];
                    idx2++;
                }
            }
            while(idx1 >= 0){
                ans[j++] = nums[idx1] * nums[idx1];
                idx1--;
            }
            while(idx2 < nums.length){
                ans[j++] = nums[idx2] * nums[idx2];
                idx2++;
            }
            return ans;
        }
    }
}