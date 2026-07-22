class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[n-1]){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid -1;
            }
        }
        return nums[ans];
    }
}