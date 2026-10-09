class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            map.put(nums1[i],i);
        }
        for(int i = nums2.length - 1 ; i >= 0 ; i--){
            while(!st.empty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(map.containsKey(nums2[i])){
                int idx = map.get(nums2[i]);
                ans[idx] = st.empty() ? -1 : st.peek();
            }
            st.push(nums2[i]);
        }
        return ans;
    }
}