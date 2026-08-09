class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        generateSubsets(nums,new ArrayList<>(),0);
        return ans;
    }
    public void generateSubsets(int[] nums, List<Integer> temp,int idx){
        if(!ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
        }
        for(int i = idx; i < nums.length ; i++){
            temp.add(nums[i]);
            generateSubsets(nums,temp,i+1);
            temp.remove(temp.size() - 1);
        }
    }
}