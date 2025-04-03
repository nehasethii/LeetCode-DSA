class Solution {
    public long maximumTripletValue(int[] nums) {
        long max = Long.MIN_VALUE;
        int n = nums.length;
        int bestJ = -1;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            suffix[i] = Math.max(suffix[i+1],nums[i]);
        }
        for(int i = 0 ; i < n ; i++){
            long maxDiff = Long.MIN_VALUE;
            for(int j = i + 1 ; j < n ; j++){
                long diff = nums[i] - nums[j];
                if(diff > maxDiff){
                    maxDiff = diff;
                }
                if(j + 1 < n)
                    max = Math.max(max,maxDiff * suffix[j+1]);
            }
        }
        return max > 0 ? max : 0;
    }
}