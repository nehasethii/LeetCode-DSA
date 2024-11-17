class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        // int[] op = new int[nums.length];
        // for (int i = 0; i < queries.length; i++) {
        //     for(int j = queries[i][0] ; j <= queries[i][1] ; j++){
        //         op[j]++;
        //     }
        // }
        // for (int i = 0; i < nums.length; i++) {
        //         if(nums[i] > op[i])
        //             return false;
        // }
        // return true;
        int[] op = new int[nums.length + 1];
        for (int i = 0; i < queries.length; i++) { 
            int l = queries[i][0]; 
            int r = queries[i][1]; 
            op[l]++; 
            if (r + 1 < nums.length) { 
                op[r + 1]--; 
            } 
        } 
        int increment = 0; 
        for (int i = 0; i < nums.length; i++) { 
            increment += op[i]; 
            if (nums[i] > increment) { 
                return false; 
            } 
        } 
        return true;
    }
}