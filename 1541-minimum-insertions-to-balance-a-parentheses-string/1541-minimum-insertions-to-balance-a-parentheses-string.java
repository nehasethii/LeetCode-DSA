class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int closedParentheses = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                if(closedParentheses > 0){
                    insertions++;
                    if(!st.empty()){
                        st.pop();
                    }
                    else{
                        insertions++;
                    }
                    closedParentheses = 0;
                }
                st.push(i);
            }
            else{
                closedParentheses++;
                if(closedParentheses == 2){
                    if(!st.empty()){
                        st.pop();
                    }
                    else{
                        insertions++;
                    }
                    closedParentheses = 0;
                }
            }
        }
        if(st.empty()){
            if(closedParentheses > 0){
                insertions += 2; //'(' & ')' are both missing
            }
        }
        else{
            insertions += 2 * st.size() - closedParentheses;
        }
        return insertions;
    }
}