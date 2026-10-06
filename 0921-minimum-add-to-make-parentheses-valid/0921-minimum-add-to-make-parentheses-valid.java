class Solution {
    public int minAddToMakeValid(String s) {
        int moves = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }
            else{
                if(st.empty()){
                    moves++;
                }
                else{
                    st.pop();
                }
            }
        }
        return moves + st.size();
    }
}