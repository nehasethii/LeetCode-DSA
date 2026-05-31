class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[n-1];
        for(int i = 0 ; i < n ; i++){
            int j = i+1 , k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return target;
                }
                else{
                    if(Math.abs(sum - target) < Math.abs(closest - target)){
                        closest = sum;
                    }
                    if(sum < target){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        return closest;
    }
}