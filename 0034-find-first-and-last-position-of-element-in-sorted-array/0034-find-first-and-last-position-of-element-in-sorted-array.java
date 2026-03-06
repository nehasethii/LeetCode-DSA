class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = BS(nums,target,true);
        if(ans[0] == -1){
            ans[1] = -1;
        }
        else{
            ans[1] = BS(nums,target,false);
        }
        return ans;
    }
    public int BS(int[] nums , int target , boolean first){
        int low = 0;
        int high = nums.length - 1;
        int res = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(target < nums[mid]){
                high = mid - 1;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else{
                res = mid;
                if(first){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return res;
    }
}