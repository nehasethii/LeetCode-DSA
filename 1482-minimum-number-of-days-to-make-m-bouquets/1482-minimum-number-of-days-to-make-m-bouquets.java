class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k > n){
            return -1;
        }
        int ans = 0;
        int low = 1;
        int high = 0;
        for(int day : bloomDay){
            high = Math.max(high,day);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int adj = 0;
            int bouquet = 0;
            for(int i = 0 ; i < n ; i++){
                int day = bloomDay[i];
                if(day <= mid){
                    if(i > 0 && bloomDay[i-1] <= mid){
                        adj++;
                    }
                    else{
                        adj = 1;
                    }
                    if(adj == k){
                        bouquet++;
                        adj = 0;
                    }
                    if(bouquet >= m){
                        break;
                    }
                }
            }
            if(bouquet >= m){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}