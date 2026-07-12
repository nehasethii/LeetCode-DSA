class Solution {
    public int minimumCost(int[] nums, int k) {
        long cost = 0;
        long inc = 1;
        long resources = k;
        long mod = 1000000007;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > resources){
                long need = (long)nums[i] - resources;
                need = (need + k - 1)/k;
                // need = (float)Math.ceil(need);
                resources += need * k;
                long n = need + inc - 1; 
                if(n % 2 == 0){
                    cost = (((n/2) % mod) * ((n+1) % mod)) % mod;
                }
                else{
                    cost = ((n % mod) * ((n+1)/2 % mod)) % mod;
                }
                inc += need;
            }
            if(nums[i] <= resources){
                resources -= nums[i];
            }
        }
        cost = cost % 1000000007;
        return (int)cost;
    }
}