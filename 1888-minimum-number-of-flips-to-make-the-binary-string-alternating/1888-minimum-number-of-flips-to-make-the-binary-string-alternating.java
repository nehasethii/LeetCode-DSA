class Solution {
    public int minFlips(String s) {
        int n = s.length();
        s += s;
        int minFlips = Integer.MAX_VALUE;
        int c1 = 0 , c2 = 0;
        for(int i = 0 ; i < 2 * n ; i++){
            char exp1 = (i % 2 == 0) ? '0' : '1';
            char exp2 = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) != exp1){
                c1++;
            }
            if(s.charAt(i) != exp2){
                c2++;
            }
            if(i >= n){
                char prev1 = ((i-n) % 2 == 0) ? '0' : '1';
                char prev2 = ((i-n) % 2 == 0) ? '1' : '0';
                if(s.charAt(i-n) != prev1){
                    c1--;
                }
                if(s.charAt(i-n) != prev2){
                    c2--;
                }
            }
            if(i >= n - 1){
                minFlips = Math.min(minFlips,Math.min(c1,c2));
            }
        }
        return minFlips;
    }
}