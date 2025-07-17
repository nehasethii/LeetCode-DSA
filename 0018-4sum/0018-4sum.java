class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> sol = new ArrayList<>();
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
                    long tgt = (long)target - nums[i] - nums[j] - nums[k];
                    if(nums[l] > tgt){
                        l--;
                    }
                    else if(nums[l] < tgt){
                        k++;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        sol.add(temp);
                        k++;
                        l--;
                        while(k < n && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(l > 0 && nums[l] == nums[i+1]){
                            l--;
                        }
                    }
                }
            }
        }
        return sol;
    }
}