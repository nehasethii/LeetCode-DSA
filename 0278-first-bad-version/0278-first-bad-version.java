/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = 0;
        int start = 0;
        int end = n;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)){
                bad = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return bad;
    }
}