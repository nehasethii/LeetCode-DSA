class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < target){
                    if(Math.abs(closestSum - target) > Math.abs(sum - target)){
                        closestSum = sum;
                    }
                    j++;
                }
                else if(sum > target){
                    if(Math.abs(closestSum - target) > Math.abs(sum - target)){
                        closestSum = sum;
                    }
                    k--;
                }
                else{
                    return target;
                }
            }
        }
        return closestSum;
    }
}