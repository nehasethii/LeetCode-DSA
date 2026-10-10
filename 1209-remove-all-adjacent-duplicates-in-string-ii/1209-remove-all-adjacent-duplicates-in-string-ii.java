class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Object[]> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(st.empty() || (s.charAt(i) != (char)st.peek()[0]) ){
                st.push(new Object[]{ch,1});
            }
            else{
                if( (int)st.peek()[1] == k-1 ){
                    for(int j = 1 ; j < k ; j++){
                        st.pop();
                    }
                }
                else{
                    st.push(new Object[]{ch,(int)st.peek()[1] + 1});
                }
            }
        }
        while(!st.empty()){
            sb.append((char)st.pop()[0]);
        }
        return sb.reverse().toString();
    }
}