class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i + 1 ; j < n ; j++){
                if(j > i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j + 1;
                int l = n - 1;
                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k < n && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(l > 0 && nums[l] == nums[l+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}