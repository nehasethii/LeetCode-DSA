class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        //BRUTE FORCE

        // int n = nums.length;
        // int max = nums[0];
        // for(int i = 0 ; i < n ; i++){
        //     int sum = 0;
        //     for(int j = i ; j < i + n ; j++){
        //         sum += nums[j % n];
        //         max = Math.max(max,sum);
        //     }
        // }
        // return max;

        //OPTIMAL

        int n = nums.length;
        int arraySum = 0;
        for(int num : nums){
            arraySum += num;
        }

        int maxSum = nums[0];
        int curSum = nums[0];
        for(int i = 1 ; i < n ; i++){
            curSum = Math.max(nums[i],curSum + nums[i]);
            maxSum = Math.max(maxSum , curSum);
        }

        int minSum = nums[0];
        int currSum = nums[0];
        for(int i = 1 ; i < n ; i++){
            currSum = Math.min(nums[i],currSum + nums[i]);
            minSum = Math.min(minSum , currSum);
        }
        if(arraySum == minSum)
            return maxSum;
        return Math.max(maxSum,arraySum - minSum);
    }
}