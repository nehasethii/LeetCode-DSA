class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid < n - 1 && nums[mid] < nums[mid + 1]){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}