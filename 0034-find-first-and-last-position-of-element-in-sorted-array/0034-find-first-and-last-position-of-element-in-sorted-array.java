class Solution {
    public int[] searchRange(int[] nums, int target) {
        int startIdx = binarySearch(nums,target,true);
        if(startIdx == -1)
            return new int[]{-1,-1};
        else
        {
            int endIdx = binarySearch(nums,target,false);
            return new int[]{startIdx,endIdx};
        }
    }
    int binarySearch(int[] arr , int target , boolean firstAppearance)
    {
        int idx = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
            {
                if(firstAppearance)
                {
                    idx = mid;
                    end = mid - 1;
                }
                else
                {
                    idx = mid;
                    start = mid + 1;
                }
            }   
        }
        return idx;
    }
}