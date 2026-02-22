class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findCombinations(candidates, target, ans, temp, 0);
        return ans;
    }
    public void findCombinations(int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp, int sum){
        if(sum > target){
            return;
        }
        if(sum == target){
            List<Integer> res = new ArrayList<>(temp);
            Collections.sort(res);
            if(!ans.contains(res)){
                ans.add(res);
            }
            return;
        }
        for(int i = 0 ; i < candidates.length ; i++){
            temp.add(candidates[i]);
            findCombinations(candidates,target,ans,temp,sum + candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}