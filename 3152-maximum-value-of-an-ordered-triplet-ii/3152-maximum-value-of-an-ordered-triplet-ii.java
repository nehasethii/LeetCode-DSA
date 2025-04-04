class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = Long.MIN_VALUE;
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i = 1 ; i < n ; i++){
            prefix[i] = Math.max(prefix[i-1],nums[i]);
            suffix[n-i-1] = Math.max(suffix[n-i],nums[n-i-1]);
        }
        long diff = 0;
        for(int j = 1 ; j < n - 1 ; j++){
            max = Math.max(max,((long)prefix[j-1] - nums[j]) * suffix[j+1]);
        }
        return max > 0 ? max : 0;
    }
}