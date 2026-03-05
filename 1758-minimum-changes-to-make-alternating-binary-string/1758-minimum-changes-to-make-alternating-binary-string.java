class Solution {
    public int minOperations(String s) {
        String s1 = "";
        String s2 = "";
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(i % 2 == 0){
                s1 += "1";
                s2 += "0";
            }
            else{
                s1 += "0";
                s2 += "1";
            }
            if(s1.charAt(i) != s.charAt(i)){
                c1++;
            }
            if(s2.charAt(i) != s.charAt(i)){
                c2++;
            }
        }
        return (c1 < c2) ? c1 : c2;
    }
}