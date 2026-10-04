class Solution {
    public boolean checkValidString(String s) {
        int star = 0;
        Stack<Integer> stars = new Stack<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                stars.push(i);
                star++;
                continue;
            }
            if(ch == '('){
                st.push(i);
            }
            else{
                if(!st.empty()){
                    st.pop();
                }
                else{
                    if(star == 0){
                        return false;
                    }
                    star--;
                }
            }
        }
        while(!st.empty() && !stars.empty()){
            if(st.peek() > stars.peek()){
                return false;
            }
            else{
                st.pop();
                stars.pop();
            }
        }
        return st.empty();
    }
}