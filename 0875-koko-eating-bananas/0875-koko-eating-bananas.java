class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        for(int pile : piles){
            high = Math.max(high,pile);
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int hrs = 0;
            for(int i = 0 ; i < n ; i++){
                hrs += piles[i]/mid;
                if(piles[i] % mid != 0){
                    hrs++;
                }
                if(hrs > h){
                    break;
                }
            }
            if(hrs > h){
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