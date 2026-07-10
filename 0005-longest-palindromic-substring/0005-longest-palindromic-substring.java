class Solution {
    String ans = "";
    int len = 0;
    public String longestPalindrome(String s) {
        for(int i = 0 ; i < s.length() ; i++){
            palindrome(s, i , i);
            if(i < s.length() - 1){
                palindrome(s, i , i + 1);
            }
        }
        return ans;
    }
    public void palindrome(String s, int low, int high){
        if(low < 0 || high >= s.length()){
            return;
        }
        if(low == high){
            if(len == 0){
                len = 1;
                ans = "";
                ans += s.charAt(low);
            }
        }
        else{
            if(s.charAt(low) != s.charAt(high)){
                return;
            }
            int l = high - low + 1;
            if(l > len){
                len = l;
                ans = s.substring(low , high + 1);
            }
        }
        palindrome(s, low - 1 ,high + 1);
    }
}