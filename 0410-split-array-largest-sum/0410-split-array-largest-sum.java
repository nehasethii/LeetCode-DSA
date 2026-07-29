class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int num : nums){
            high += num;
            low = Math.max(low,num);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int subArrays = 0;
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                sum += nums[i];
                if(sum > mid){
                    subArrays++;
                    sum = nums[i];
                }
                if(i == n-1 && sum <= mid){
                    subArrays++;
                }
            }
            if(subArrays > k){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}