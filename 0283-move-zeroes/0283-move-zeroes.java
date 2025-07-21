class Solution {
    public void moveZeroes(int[] nums) {
        int z = -1;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                if(z == -1)
                    z = i;
            }
            else if(z == -1){
                continue;
            }
            else{
                nums[z] = nums[i];
                nums[i] = 0;
                if(i - z > 1){
                    z++;
                }
                else{
                    z = i;
                }
            }
        }
    }
}