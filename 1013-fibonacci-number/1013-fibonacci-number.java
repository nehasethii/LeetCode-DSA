class Solution {
    public int fibbonacci(int n,int[] dp)
    {
        if(n == 0 || n == 1)
            return n;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i <= n ; i++)
        {
            int num = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = num;
        }
        return dp[1];
    }
    public int fib(int n) {
        int[] dp = {-1,-1};
        return fibbonacci(n,dp);
    }
}