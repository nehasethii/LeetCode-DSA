class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1 , k = n - 1;
            int target = -nums[i];
            while(j < k){
                List<Integer> temp = new ArrayList<>();
                if(nums[j] + nums[k] < target){
                    j++;
                }
                else if(nums[j] + nums[k] > target){
                    k--;
                }
                else{
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < n && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(k > 0 && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}