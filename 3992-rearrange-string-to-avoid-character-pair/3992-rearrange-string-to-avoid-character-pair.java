class Solution {
    public String rearrangeString(String s, char x, char y) {
        int xCount = 0 , yCount = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch == x){
                xCount++;
            }
            if(ch == y){
                yCount++;
            }
        }
        if(xCount == 0 || yCount == 0){
            return s;
        }
        StringBuilder t = new StringBuilder();
        for(int i = 0 ; i < yCount ; i++){
            t.append(y);
        }
        for(int i = 0 ; i < xCount ; i++){
            t.append(x);
        }
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            if(ch != y && ch != x){
                t.append(ch);
            }
        }
        return t.toString();
    }
}