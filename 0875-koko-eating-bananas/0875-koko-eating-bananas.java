class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            high = Math.max(high,piles[i]);
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canEat(piles,h,mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public boolean canEat(int[] piles , int h , int speed){
        long hrs = 0;
        for(int i = 0 ; i < piles.length ; i++){
            hrs += piles[i]/speed;
            if(piles[i] % speed != 0){
                hrs++;
            }
        }
        return hrs <= h; 
    }
}