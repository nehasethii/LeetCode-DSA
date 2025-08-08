class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int arraySum = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            arraySum += nums[i];
        }
        int maxSoFar = nums[0];
        int kadaneSum = nums[0];
        int minSoFar = nums[0];
        int minSum = nums[0];
        for(int i = 1 ; i < n ; i++){
            maxSoFar = Math.max(maxSoFar + nums[i] , nums[i]);
            kadaneSum = Math.max(kadaneSum , maxSoFar);
            minSoFar = Math.min(minSoFar + nums[i] , nums[i]);
            minSum = Math.min(minSum , minSoFar);
        }
        if(arraySum == minSum){
            return kadaneSum;
        }
        return Math.max(kadaneSum , arraySum - minSum);
    }
}