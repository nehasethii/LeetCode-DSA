class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = {0,-1};
        while(true){
            for(int i = sol[0] + 1 ; i < nums.length ; i++){
                if(nums[sol[0]] + nums[i] == target){
                    sol[1] = i;
                    return sol;
                }
            }
            sol[0]++;
        }
    }
}
