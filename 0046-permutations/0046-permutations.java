class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        return permutations(nums,temp,ans);
    }
    public List<List<Integer>> permutations(int[] nums, List<Integer> temp , List<List<Integer>> ans){
        if(temp.size() == nums.length){
            if(!ans.contains(temp)){
                List<Integer> permutation = new ArrayList<>(temp);
                ans.add(permutation);
                return ans;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                permutations(nums,temp,ans);
                temp.remove(temp.size() - 1);
            }
        }
        return ans;
    }
}