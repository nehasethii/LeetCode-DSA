class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> compliment = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int element = target - nums[i];
            if(compliment.containsKey(element) && compliment.get(element) != i){
                ans[0] = compliment.get(element);
                ans[1] = i;
            }
            compliment.put(nums[i],i);
        }
        return ans;
    }
}