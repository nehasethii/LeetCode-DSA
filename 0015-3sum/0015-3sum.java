class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n - 2 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1 , k = n - 1;
            while(j < n && k < n && j < k){
                if((nums[j] + nums[k]) == -nums[i]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    triplets.add(temp);
                    j++;
                    k--;
                    while(j < n && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(k > n && nums[k] == nums[k+1]){
                        k++;
                    }
                }
                else if(nums[j] + nums[k] < -nums[i]){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return triplets;
    }
}