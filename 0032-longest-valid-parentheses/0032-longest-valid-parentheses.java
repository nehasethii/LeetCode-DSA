class Solution {
    public int longestValidParentheses(String s) {
        int max = 0;
        int count = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.empty()){
                    st.pop();
                    if(st.empty()){ // NO MATCH
                        st.push(i);
                    }
                    else{ // MATCH FOUND
                        count = i - st.peek();
                        max = Math.max(max,count);
                    }
                }
            }
        }
        return max;
    }
}