class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int currentNum = 0 ,count;
        for(int i = 0 ; i < nums.length ; i++)
        {
            count = 0;
            currentNum = nums[i];
            for(int j = 0 ; j < nums.length ; j++)
            {
                if (nums[j] < currentNum)
                {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}