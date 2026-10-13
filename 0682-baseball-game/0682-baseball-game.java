class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer[]> st = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            char ch = operations[i].charAt(0);
            if(ch == '+'){
                int n1 = st.pop()[0];
                int n2 = n1 + st.peek()[0];
                st.push(new Integer[]{n1 , st.peek()[1] + n1});
                st.push(new Integer[]{n2 , st.peek()[1] + n2});
            }
            else if(ch == 'C'){
                st.pop();
            }
            else if(ch == 'D'){
                st.push(new Integer[]{2 * st.peek()[0] , st.peek()[1] + 2 * st.peek()[0]});
            }
            else{
                int num = valueOf(operations[i]);
                if(st.empty()){
                    st.push(new Integer[]{num , num});
                }
                else{
                    st.push(new Integer[]{num , st.peek()[1] + num});
                }
            }
        }
        return st.empty() ? 0 : st.peek()[1];
    }
    public int valueOf(String s){
        int ans = 0;
        boolean negative = false;
        for(int i = 0 ; i < s.length() ; i++){
            if(i == 0 && s.charAt(i) == '-'){
                negative = true;
                continue;
            }
            ans = ans * 10 + (s.charAt(i) - '0');
        }
        return negative ? -ans : ans;
    }
}