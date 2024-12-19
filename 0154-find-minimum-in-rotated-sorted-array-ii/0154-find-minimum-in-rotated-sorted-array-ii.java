class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return (pivot == -1) ? nums[0] : nums[pivot + 1];
    }
    int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(nums[mid] == nums[start] && nums[mid] == nums[end])
            {
                if(start < nums.length - 1 && nums[start] > nums[start + 1])
                    return start;
                start++;
                if(end > 0 && nums[end] < nums[end-1])
                    return end - 1;
                end--;
            }
            else if(nums[mid] < nums[start] || 
            (nums[mid] == nums[start] && nums[mid] < nums[end]))
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}