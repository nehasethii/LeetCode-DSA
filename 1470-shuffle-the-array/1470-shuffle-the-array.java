class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int j = 0;
        for(int i = 0 ; i < 2 * n ; i++){
            if(i % 2 == 0){
                ans[i] = nums[j];
            }
            else{
                ans[i] = nums[j+n];
                j++;
            }
        }   
        return ans;
    }
}