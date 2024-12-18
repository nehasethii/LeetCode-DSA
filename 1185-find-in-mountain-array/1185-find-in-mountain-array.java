/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1))
                end = mid;
            else if(mountainArr.get(mid) < mountainArr.get(mid + 1))
                start = mid + 1;
        }
        if(target == mountainArr.get(start))
            return start;
        int idx = orderAgnosticBS(target,mountainArr,0,start,true);
        return (idx != -1) ? idx : orderAgnosticBS(target,mountainArr,start,mountainArr.length() - 1,false);
    }
    public int orderAgnosticBS(int target,MountainArray mountainArr,int start,int end,boolean isAscending)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > mountainArr.get(mid))
            {
                if(isAscending)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else if(target < mountainArr.get(mid))
            {
                if(isAscending)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }
}