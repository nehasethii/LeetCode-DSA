class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        long sum = 0;
        int ans = 0;
        for(int candy : candies){
            sum += candy;
        }
        if(sum < k){
            return 0;
        }
        long low = 1;
        long high = sum/k;
        while(low <= high){
            long mid = low + (high - low)/2;
            long piles = 0;
            for(int candy : candies){
                piles += candy/mid;
            }
            if(piles < k){
                high = mid - 1;
            }
            else{
                ans = (int)mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}