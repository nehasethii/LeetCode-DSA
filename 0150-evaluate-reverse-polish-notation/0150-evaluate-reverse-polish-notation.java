class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < tokens.length ; i++){    
            char ch = tokens[i].charAt(0);
            if(tokens[i].length() == 1 && (ch == '+' || ch == '-' || ch == '*' || ch == '/')){
                int n1 = st.pop();
                int n2 = st.pop();
                switch(ch){
                    case '+':
                        st.push(n2 + n1);
                        break;
                    case '-':
                        st.push(n2 - n1);
                        break;
                    case '*':
                        st.push(n2 * n1);
                        break;
                    case '/':
                        st.push(n2 / n1);
                }
            }
            else{
                st.push(numValOf(tokens[i]));
            }
        }
        return st.peek();
    }
    public int numValOf(String s){
        boolean pos = true;
        int num = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '-'){
                pos = false;
            }
            else{
                num = num * 10 + (s.charAt(i) -'0');
            }
        }
        return pos ? num : -num;
    }
}