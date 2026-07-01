class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int zeros = 0;
        int ones = 0;
        int ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                zeros++;
            }
            else{
                ones++;
            }
            int diff = zeros - ones;
            if(diff == 0){
                ans = Math.max(ans,i+1);
                continue;
            }
            if(map.containsKey(diff)){
                int len = i - map.get(diff);
                ans = Math.max(ans,len);
            }
            else{
                map.put(diff , i);
            }
        }
        return ans;
    }
}