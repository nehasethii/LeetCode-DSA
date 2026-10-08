class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int begin = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();
            }
            if(st.empty()){
                ans.append(s.substring(begin + 1 , i));
                begin = i + 1;
            }
        }
        return ans.toString();
    }
}