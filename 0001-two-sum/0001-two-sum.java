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










        // int[] solution = new int[2];
        // for(int i = 0 ; i < nums.length - 1 ; i++)
        // {
        //     for(int j = nums.length - 1 ; j != i ; j--)
        //     {
        //         if((nums[i] + nums[j]) == target)
        //         {
        //             solution[0] = i;
        //             solution[1] = j;
        //         }
        //     }
        // }  
        // return solution;      
    }
}