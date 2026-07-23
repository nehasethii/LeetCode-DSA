class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = 0;
        int ans = 0;
        for(int num : piles){
            high = Math.max(high,num);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            long hrs = 0;
            for(int pile : piles){
                hrs += pile/mid;
                if(pile % mid != 0){
                    hrs++;
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