class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer[]> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n - 1 ; i >= 0 ; i--){
            while(!st.empty() && st.peek()[0] <= temperatures[i]){
                st.pop();
            }
            ans[i] = st.empty() ? 0 : st.peek()[1] - i;
            st.push(new Integer[]{ temperatures[i] , i});
        }
        return ans;
    }
}