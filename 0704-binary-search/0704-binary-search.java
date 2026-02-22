class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return binarySearch(nums,target,low,high);
    }
    public int binarySearch(int[] nums,int target,int low,int high){
        int mid = low + (high - low)/2;
        if(low > high){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            return binarySearch(nums,target,low+1,high);
        }
        else{
            return binarySearch(nums,target,low,high-1);
        }
    }
}