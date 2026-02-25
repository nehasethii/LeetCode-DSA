class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        paranthesisCombinations(n,ans,"",0,0);
        return ans;
    }
    public void paranthesisCombinations(int n, List<String> ans, String temp, 
    int op, int cp){
        if(op == n && cp == n){
            ans.add(temp);
            return;
        }
        if(op < n){
            temp += "(";
            paranthesisCombinations(n,ans,temp,op+1,cp);
            temp = temp.substring(0,temp.length()-1);
        }
        if(cp < op){
            temp += ")";
            paranthesisCombinations(n,ans,temp,op,cp+1);
            temp = temp.substring(0,temp.length()-1);
        }
    }
}