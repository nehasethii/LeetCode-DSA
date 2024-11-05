class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> indices = new ArrayList<>();
        Arrays.sort(nums);
        int firstIdx = binarySearch(nums,target,true);
        if(firstIdx != -1)
        {
            int lastIdx = binarySearch(nums,target,false);
            for(int i = firstIdx ; i <= lastIdx ; i++)
                indices.add(i);
        }
        return indices;
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