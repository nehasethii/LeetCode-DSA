class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = strs.length;
        boolean[] ans = new boolean[n];
        int zero = 0, one = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
            else{
                one++;
            }
        }
        outer: 
        for(int i = 0 ; i < n ; i++){
            int z = zero;
            int o = one;
            int q = 0;
            for(int j = 0 ; j < strs[i].length() ; j++){
                if(strs[i].charAt(j) == '0'){
                    z--;
                }
                else if(strs[i].charAt(j) == '1'){
                    o--;
                }
                else{
                    q++;
                }
            }
            if(z < 0 || o < 0 || (z + o) != q){
                ans[i] = false;
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < strs[i].length() ; j++){
                if(strs[i].charAt(j) == '?'){
                    if(z > 0){
                        sb.append('0');
                        z--;
                    }
                    else{
                        sb.append('1');
                        o--;
                    }
                }
                else{
                    sb.append(strs[i].charAt(j));
                }
            }
            int l1 = 0;
            int l2 = 0;
            while(l1 < s.length() && l2 < sb.length()){
                while(l1 < s.length() && s.charAt(l1) == '1'){
                    l1++;
                }
                while(l2 < sb.length() && sb.charAt(l2) == '1'){
                    l2++;
                }
                if(l1 < l2){
                    ans[i] = false;
                    continue outer;
                }
                l1++;
                l2++;
            }
            ans[i] = true;
        }
        return ans;
    }
}