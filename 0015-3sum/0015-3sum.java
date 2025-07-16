class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int j = i + 1;
            int k = n - 1;
            int target = -nums[i];
            while(j < k){
                if(nums[j] + nums[k] > target){
                    k--;
                }
                else if(nums[j] + nums[k] < target){
                    j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    sol.add(temp);
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
        return sol;
    }
}