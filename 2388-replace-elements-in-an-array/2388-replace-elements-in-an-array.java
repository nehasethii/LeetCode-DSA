class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> indices = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
            indices.put(nums[i],i);
        for(int i = 0 ; i < operations.length ; i++)
        {
            int idx = indices.get(operations[i][0]);
            nums[idx] = operations[i][1];
            indices.put(nums[idx],idx);
        }
        return nums;
    }
}