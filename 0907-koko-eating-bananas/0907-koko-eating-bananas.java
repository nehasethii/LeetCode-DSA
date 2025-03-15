class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = -1;
        for(int i = 0 ; i < piles.length ; i++){
            right = Math.max(right,piles[i]);
        }
        while(left <= right){
            int mid = left + (right - left)/2; 
            if(canEatAll(piles,h,mid))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
    private boolean canEatAll(int[] piles , int h , int k){
        long hours = 0;
        for(int i = 0 ; i < piles.length ; i++){
            hours += piles[i]/k;
            if(piles[i] % k != 0)
                hours++;
        }
        return hours <= h;
    }
}