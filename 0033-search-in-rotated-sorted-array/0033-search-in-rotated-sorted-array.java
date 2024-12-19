class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1)
            return binarySearch(nums,target,0,nums.length -1);
        if(target == nums[pivot])
            return pivot;
        if(target >= nums[0])
            return binarySearch(nums,target,0,pivot);
        return binarySearch(nums,target,pivot+1,nums.length -1);
    }
    int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(mid < nums.length -1 && nums[mid] > nums[mid+1])
                return mid;
            if(mid > 0 && nums[mid] < nums[mid-1])
                return mid - 1;
            if(nums[mid] > nums[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    int binarySearch(int[] nums, int target , int start , int end)
    {
        while(start <= end)
            {
                int mid = start + (end - start)/2;
                if(target > nums[mid])
                    start = mid + 1;
                else if(target < nums[mid])
                    end = mid - 1;
                else
                    return mid;
            }
            return -1;
    }
}