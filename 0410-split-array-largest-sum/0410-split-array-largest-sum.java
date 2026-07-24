class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        long max = 0;
        for(int num : nums){
            sum += num;
            max = Math.max(max,num);
        }
        long low = max;
        long high = sum;
        int ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            sum = 0;
            int subArrayCount = 0;
            for(int i = 0 ; i < n ; i++){
                sum += nums[i];
                if(sum > mid){
                    subArrayCount++;
                    sum = nums[i];
                }
                if(i == n-1 && sum <= mid){
                    subArrayCount++;
                }
            }
            if(subArrayCount > k){
                low = mid + 1;
            }
            // else if(subArrayCount < k){
            //     high = mid - 1;
            // }
            else{
                ans = (int)mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}