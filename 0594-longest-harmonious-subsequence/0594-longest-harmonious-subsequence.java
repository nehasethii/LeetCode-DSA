class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0) + 1);
        }
        int length = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] - nums[i-1] == 1){
                length = Math.max(length , freq.get(nums[i-1]) + freq.get(nums[i]));
            }
        }
        return length;
    }
}