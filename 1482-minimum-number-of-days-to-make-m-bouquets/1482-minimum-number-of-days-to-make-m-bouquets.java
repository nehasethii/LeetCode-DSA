class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long low = 0;
        long high = 0;
        for(int day : bloomDay){
            low = Math.min(low,day);
            high = Math.max(high,day);
        }
        int ans = -1;
        while(low <= high){
            long mid = low + (high - low)/2;
            int flowers = 0;
            int bouquets = 0;
            for(int i = 0 ; i < n ; i++){
                if(bloomDay[i] <= mid){
                    flowers++;
                }
                else{
                    flowers = 0;
                }
                if(flowers == k){
                    bouquets++;
                    flowers = 0;
                }
                if(bouquets >= m){
                    break;
                }
            }
            if(bouquets < m){
                low = mid + 1;
            }
            else{
                ans = (int)mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}