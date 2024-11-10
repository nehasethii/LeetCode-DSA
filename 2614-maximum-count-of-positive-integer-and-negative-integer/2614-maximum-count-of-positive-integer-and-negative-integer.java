class Solution {
    public int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;
        //positive count
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] > 0)
            {
                if(mid > 0 && nums[mid - 1] <= 0)
                {
                    posCount += nums.length - mid;
                    break;
                }
                else if(mid == 0)
                {
                    posCount += nums.length;
                    break;
                }
                else
                    end = mid - 1;
            }
            else
                start = mid + 1;
        }
        //negative count
        start = 0;
        end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] < 0)
            {
                if(mid < nums.length - 1 && nums[mid + 1] >= 0)
                {
                    negCount += mid + 1;
                    break;
                }
                else if(mid == nums.length - 1)
                {
                    negCount += nums.length;
                    break;
                }
                else
                    start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return posCount >= negCount ? posCount : negCount;
    }
}