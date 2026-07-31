class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        permute(nums,temp);
        return ans;
    }
    public void permute(int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            List<Integer> permutation = new ArrayList<>();
            for(int i = 0 ; i < temp.size() ; i++){
                permutation.add(nums[temp.get(i)]);
            }
            if(!ans.contains(permutation)){
                List<Integer> permut = new ArrayList<>(permutation);
                ans.add(permut);
                return;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!temp.contains(i)){
                temp.add(i);
                permute(nums,temp);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
}