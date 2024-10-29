class Solution {
    public int findMin(int[] nums) {
        int pivot = findPivot(nums);
        return (pivot == -1 || pivot == nums.length - 1) ? nums[0] : nums[pivot + 1];
    }
    int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[start] == nums[mid] && nums[end] == nums[mid])
            {
                if(nums[start] > nums[start + 1])
                    return start;
                start++;
                if(nums[end] < nums[end - 1])
                    return end;
                end--;
            }
            else if(nums[start] > nums[mid] || (nums[start] == nums[mid] && nums[end] > nums[mid]))
                end = mid - 1;
            else
                start = mid + 1; 
        }
        return -1;
    }
}