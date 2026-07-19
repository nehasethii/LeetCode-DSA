class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1){
            return s;
        }
        long ans = (long)s + ((long)n/2) * ((long)m - 1) + 1;
        return ans;
        // long res = s;
        // long ans = s;
        // for(int i = 1 ; i < n ; i++){
        //     if(i % 2 != 0){
        //         ans += m;
        //     }
        //     else{
        //         ans--;
        //     }
        //     res = Math.max(res,ans);
        // }
        // return res;
    }
}