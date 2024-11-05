class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;
        first = binarySearch(nums,target,true);
        if(first != -1)
            last = binarySearch(nums,target,false);
        return new int[]{first,last};
    }
    public int binarySearch(int[] nums,int target,boolean isStartIdx)
    {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
            {
                idx = mid;
                if(isStartIdx)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return idx;
    }
}