class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permutations(nums,ans,temp,visited);
        return ans;
    }
    public void permutations(int[] nums,List<List<Integer>> ans, List<Integer> temp, boolean[] visited){
        if(temp.size() == nums.length){
            List<Integer> res = new ArrayList<>(temp);
            if(!ans.contains(res)){
                ans.add(res);
            }
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i] = true;
                permutations(nums,ans,temp,visited);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}