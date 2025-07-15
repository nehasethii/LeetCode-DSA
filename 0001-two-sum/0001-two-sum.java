class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> idx = new HashMap<>();
        int[] sol = new int[2];
        for(int i = 0 ; i < nums.length ; i++){
            idx.put(nums[i],i);
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(idx.containsKey(target - nums[i])){
                sol[0] = i;
                sol[1] = idx.get(target - nums[i]);
                if(sol[0] != sol[1])
                    return sol;
            }
        }
        return sol;
    }
}