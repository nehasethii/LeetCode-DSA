class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        generateSubsets(nums,0,temp);
        return ans;
    }
    public void generateSubsets(int[] nums , int idx , List<Integer> temp){
        if(idx == nums.length){
            List<Integer> subset = new ArrayList<>(temp);
            ans.add(subset);
            return;
        }
        generateSubsets(nums,idx+1,temp);
        temp.add(nums[idx]);
        generateSubsets(nums,idx+1,temp);
        temp.remove(temp.size() - 1);
    }
}