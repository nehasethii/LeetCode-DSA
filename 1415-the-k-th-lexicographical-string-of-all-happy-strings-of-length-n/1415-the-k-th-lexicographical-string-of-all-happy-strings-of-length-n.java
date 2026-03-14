class Solution {
    public String getHappyString(int n, int k) {
        List<String> ans = new ArrayList<>();
        genHappyStrings(n,k,ans,new StringBuilder());
        if(ans.size() >= k){
            return ans.get(k-1);
        }
        return "";
    }
    public void genHappyStrings(int n, int k, List<String> ans, StringBuilder s){
        if(s.length() == n){
            ans.add(s.toString());
            return;
        }
        if(s.length() > 0){
            if(s.charAt(s.length() - 1) != 'a'){
                s.append('a');
                genHappyStrings(n,k,ans,s);
                s.deleteCharAt(s.length() - 1);
            }
            if(s.charAt(s.length() - 1) != 'b'){
                s.append('b');
                genHappyStrings(n,k,ans,s);
                s.deleteCharAt(s.length() - 1);
            }
            if(s.charAt(s.length() - 1) != 'c'){
                s.append('c');
                genHappyStrings(n,k,ans,s);
                s.deleteCharAt(s.length() - 1);
            }
        }
        else{
            s.append('a');
            genHappyStrings(n,k,ans,s);
            s.deleteCharAt(s.length() - 1);
            s.append('b');
            genHappyStrings(n,k,ans,s);
            s.deleteCharAt(s.length() - 1);
            s.append('c');
            genHappyStrings(n,k,ans,s);
            s.deleteCharAt(s.length() - 1);
        }
    }
}