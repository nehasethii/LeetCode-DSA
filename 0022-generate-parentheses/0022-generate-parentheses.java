class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        return genParenthesis(n,0,0,s,ans);
    }
    public List<String> genParenthesis(int n ,int open ,int close, StringBuilder s,List<String> ans){
        if(open == n && close == n){
            ans.add(s.toString());
            return ans;
        }
        if(open < n){
            s.append("(");
            genParenthesis(n,open + 1,close,s,ans);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open){
            s.append(")");
            genParenthesis(n,open,close+1,s,ans);
            s.deleteCharAt(s.length() - 1);
        }
        return ans;
    }
}