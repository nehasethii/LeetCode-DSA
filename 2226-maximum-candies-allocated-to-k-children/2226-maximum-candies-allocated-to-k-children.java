class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        long sum = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            sum += candies[i];
        }
        if(sum < k){
            return 0;
        }
        long low = 1;
        long high = sum/k;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(canCreatePiles(candies,k,mid)){
                ans = (int)mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public boolean canCreatePiles(int[] candies, long k , long candy){
        long piles = 0;
        for(int i = 0 ; i < candies.length ; i++){
            piles += candies[i]/candy;
            if(piles >= k){
                return true;
            }
        }
        return piles >= k;
    }
}