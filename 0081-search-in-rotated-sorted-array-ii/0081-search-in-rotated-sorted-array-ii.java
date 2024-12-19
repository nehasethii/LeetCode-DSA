class Solution {
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length - 1);
        if(target == nums[pivot])
            return true;
        if(target >= nums[0])
            return binarySearch(nums,target,0,pivot-1);
        return binarySearch(nums,target,pivot + 1,nums.length - 1);
    }
    int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if((nums[mid] == nums[start]) && (nums[mid] == nums[end]))
            {
                if(start < nums.length - 1 && nums[start] > nums[start + 1])
                    return start;
                start++;
                if(end > 0 && nums[end] < nums[end - 1])
                    return end - 1;
                end--;
            }
            else if(nums[mid] > nums[start] || (nums[mid] == nums[start] && 
            nums[mid] > nums[end]))
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    boolean binarySearch(int[] nums ,int target,int start,int end)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
                return true;
        }
        return false;
    }
}