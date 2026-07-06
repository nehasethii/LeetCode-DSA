class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int skip = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) == '*'){
                skip++;
                continue;
            }
            else if(skip > 0){
                skip--;
            }
            else{
                sb.insert(0,s.charAt(i));
            }
        }
        return sb.toString();
    }
}