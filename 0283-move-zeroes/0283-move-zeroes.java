class Solution {
    public void moveZeroes(int[] nums) {
        int z = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                if(z == -1){
                    z = i;
                }
            }
            else{
                if(z != -1){
                    nums[z] = nums[i];
                    nums[i] = 0;
                    z++;
                }
            }
        }
    }
}