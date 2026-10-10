class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(st.empty() || s.charAt(i) != st.peek()){
                st.push(s.charAt(i));
            }
            else{
                st.pop();
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}