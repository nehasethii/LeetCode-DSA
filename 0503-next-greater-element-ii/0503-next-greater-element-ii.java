class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];
        for(int i = nums.length - 2 ; i >= 0 ; i--){
            st.push(nums[i]);
        }
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            while(!st.empty() && st.peek() <= nums[i]){
                st.pop();
            }
            ans[i] = st.empty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return ans;
    }
}