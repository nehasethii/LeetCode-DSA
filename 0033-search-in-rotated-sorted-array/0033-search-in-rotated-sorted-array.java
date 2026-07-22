class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < nums[n-1]){
                if(nums[mid] > target){
                    high = mid - 1;
                }
                else{
                    if(target > nums[n-1]){
                        high = mid - 1;
                    }
                    else{
                        low = mid + 1;
                    }
                }
            }
            else{
                if(nums[mid] < target){
                    low = mid + 1;
                }
                else{
                    if(target < nums[0]){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}