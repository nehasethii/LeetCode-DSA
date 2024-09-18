class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int k = 0;
        Map<Integer,Integer> count = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            count.put(nums[i],count.getOrDefault(nums[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> set : count.entrySet())
        {
            if(set.getValue() == 2)
            {
                result[k] = set.getKey();
                k++;
            }
        }
        return result;
    }
}