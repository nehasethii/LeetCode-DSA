class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i + 1;
            int k = n - 1;
            int tgt = target - nums[i];
            while(j < k){
                if((nums[j] + nums[k]) > tgt){
                    int diff = nums[j] + nums[k] - tgt;
                    if(diff < minDiff){
                        minDiff = diff;
                        sum = target + diff;
                    }
                    k--;
                }
                else if((nums[j] + nums[k]) < tgt){
                    int diff = tgt - (nums[j] + nums[k]);
                    if(diff < minDiff){
                        minDiff = diff;
                        sum = target - diff;
                    }
                    j++;
                }
                else{
                    return target;
                }
            }
        }
        return sum;
    }
}