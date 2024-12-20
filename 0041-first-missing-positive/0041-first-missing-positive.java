class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean contains1 = false;
        for(int i = 0; i < n ; i++)
        {
            if(nums[i] == 1)
                contains1 = true;
            if(nums[i] <= 0 || nums[i] > n)
                nums[i] = 1;
        }
        if(!contains1)
            return 1;
        for(int i = 0 ; i < n ; i++)
            nums[Math.abs(nums[i] % n)] = -Math.abs(nums[Math.abs(nums[i] % n)]);
        for(int i = 1; i <= n ; i++)
        {
            if(nums[i % n] > 0)
                return i;
        }
        return n + 1;
    }
}