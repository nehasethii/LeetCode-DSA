class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = -1;
        for(int i = 0 ; i < candies.length ; i++){
            right = Math.max(right,candies[i]);
        }
        while(left < right){
            int mid = (left + right + 1)/2;
            if(canCreatePiles(candies,k,mid))
                left = mid;
            else
                right = mid - 1;
        }
        return left;
    }
    private static boolean canCreatePiles(int[] candies , long k , int size){
        long count = 0;
        for(int i = 0 ; i < candies.length ; i++){
            count += candies[i]/size;
        }
        return (count >= k);
    }
}