class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean has1 = false;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == 1)
                has1 = true;
            if(nums[i] < 1 || nums[i] > n)
                nums[i] = 1;
        }
        if(!has1)
            return 1;
        for(int i = 0 ; i < n ; i++)
            nums[Math.abs(nums[i] % n)] = -Math.abs(nums[Math.abs(nums[i]) % n]);
        for(int i = 1; i <= n ; i++)
        {
            if(nums[i % n] > 0)
                return i;
        }
        return n+1;
    }
}