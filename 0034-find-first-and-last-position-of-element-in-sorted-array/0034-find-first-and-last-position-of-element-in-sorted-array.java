class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = binarySearch(nums, target, true);
        if(ans[0] == -1){
            return ans;
        }
        ans[1] = binarySearch(nums, target , false);
        return ans;
    }
    public int binarySearch(int[] nums, int target, boolean first){
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                ans = mid;
                if(first){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return ans;
    }
}