class Solution {
    int mod = 1000000007;
    int[][][][] dp;
    public int numberOfStableArrays(int zero, int one, int limit) {
        dp = new int[zero+1][one+1][2][limit+1];
        for(int i = 0 ; i < zero + 1 ; i++){
            for(int j = 0 ; j < one + 1 ; j++){
                Arrays.fill(dp[i][j][0],-1);
                Arrays.fill(dp[i][j][1],-1);
            }
        }
        long ans = 0;
        if(zero > 0){
            ans += countStableArrays(zero-1,one,0,1,limit);
        }
        if(one > 0){
            ans += countStableArrays(zero,one-1,1,1,limit);
        }
        return (int)(ans % mod);
    }
    public int countStableArrays(int z, int o, int last, int count, int limit){
        if(z == 0 && o == 0){
            return 1;
        }
        if(dp[z][o][last][count] != -1){
            return dp[z][o][last][count];
        }
        long ans = 0;
        if(z > 0){
            if(last != 0){
                ans += countStableArrays(z-1,o,0,1,limit);
            }
            else if(count < limit){
                ans += countStableArrays(z-1,o,0,count+1,limit);
            }
        }
        if(o > 0){
            if(last != 1){
                ans += countStableArrays(z,o-1,1,1,limit);
            }
            else if(count < limit){
                ans += countStableArrays(z,o-1,1,count+1,limit);
            }
        }
        dp[z][o][last][count] = (int)(ans % mod);
        return dp[z][o][last][count];
    }
}