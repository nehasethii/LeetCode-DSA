class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
        int[] subArrayNum = new int[nums.length];
        subArrayNum[0] = 0;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if((nums[i] % 2) != (nums[i-1] % 2))
                subArrayNum[i] = subArrayNum[i-1];
            else
                subArrayNum[i] = subArrayNum[i-1] + 1;
        }
        int i = 0;
        for(int[] query : queries)
        {
            if(subArrayNum[query[0]] != subArrayNum[query[1]])
                result[i] = false;
            else
                result[i] = true;
            i++;
        }
        return result;
    }
}