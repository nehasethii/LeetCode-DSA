class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int high = 0;
        for(int wt : weights){
            high += wt;
            low = Math.max(low,wt);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int wt = 0;
            int d = 0;
            for(int i = 0 ; i < n ; i++){
                wt += weights[i];
                if(wt > mid){
                    d++;
                    wt = weights[i];
                }
                if(i == n-1 && wt <= mid){
                    d++;
                }
                if(d > days){
                    break;
                }
            }
            if(d > days){
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