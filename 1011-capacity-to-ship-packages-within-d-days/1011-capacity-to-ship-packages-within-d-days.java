class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int max = 0;
        for(int wt : weights){
            max = Math.max(max,wt);
            sum += wt;
        }
        int low = max;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int wtLoaded = 0;
            int daysCount = 0;
            for(int i = 0 ; i < n ; i++){
                int wt = weights[i];
                if(wtLoaded + wt <= mid){
                    wtLoaded += wt;
                }
                else{
                    i--;
                    daysCount++;
                    wtLoaded = 0;
                }
                if(i == n-1 && wtLoaded <= mid){
                    daysCount++;
                }
            }
            if(daysCount > days){
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