class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] * nums[i];
        }
        int i = 0;
        int j = n - 1;
        int[] ans = new int[n];
        int idx = n-1;
        while(i <= j){
            if(nums[i] > nums[j]){
                ans[idx--] = nums[i++];
            }
            else{
                ans[idx--] = nums[j--];
            }
        }
        return ans;
    }
}