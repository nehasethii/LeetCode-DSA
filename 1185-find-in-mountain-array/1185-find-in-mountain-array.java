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
        if(mountainArr.length() < 3)
            return -1;
        int n = mountainArr.length();
        int start = 0;
        int end = n;
        while(start < end)
        {
            int mid = start + (end - start)/2;
            if((mid <= mountainArr.length() - 2) && (mountainArr.get(mid) > mountainArr.get(mid + 1)))
                end = mid;
            else
                start = mid + 1;
        }
        int idx1 = orderAgnosticBS(target , mountainArr , 0 , start - 1, true);
        int idx2 = -1;
        if(idx1 != -1)
            return idx1;
        idx2 = orderAgnosticBS(target , mountainArr , start, n - 1 , false);
        if(idx1 == -1 && idx2 == -1)
            return -1;
        else if(idx1 == -1)
            return idx2;
        else if(idx2 == -1)
            return idx1;
        else
            return Math.min(idx1,idx2);
    }
    static int orderAgnosticBS(int target , MountainArray mountainArr , int start , int end ,boolean isAsc)
    {
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(target > mountainArr.get(mid))
            {
                if(isAsc)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
            else if(target < mountainArr.get(mid))
            {
                if(isAsc)
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