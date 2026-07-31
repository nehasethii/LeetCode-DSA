class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permute(nums,temp,visited);
        return ans;
    }
    public void permute(int[] nums, List<Integer> temp, boolean[] visited){
        if(temp.size() == nums.length){
            if(!ans.contains(temp)){
                List<Integer> permut = new ArrayList<>(temp);
                ans.add(permut);
                return;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                temp.add(nums[i]);
                permute(nums,temp,visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
        return;
    }
}