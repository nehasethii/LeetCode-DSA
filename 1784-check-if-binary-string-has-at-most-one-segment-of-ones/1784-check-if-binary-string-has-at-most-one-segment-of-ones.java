class Solution {
    public boolean checkOnesSegment(String s) {
        boolean containsSegment = false;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1' && !containsSegment){
                containsSegment = true;
            }
            else if(containsSegment){
                if(s.charAt(i) == '1' && s.charAt(i-1) != '1'){
                    return false;
                }
            }
        }
        return containsSegment;
    }
}