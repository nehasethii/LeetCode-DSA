class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateCombinations(candidates,target,ans,temp,0,0);
        return ans;
    }
    public void generateCombinations(int[] candidates, int target, List<List<Integer>> ans, List<Integer> temp, int sum, int start){
        if(sum > target){
            return;
        }
        if(sum == target){
            List<Integer> res = new ArrayList<>(temp);
            ans.add(res);
            return;
        }
        for(int i = start ; i < candidates.length ; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            generateCombinations(candidates,target,ans,temp,sum+candidates[i],i+1);
            temp.remove(temp.size() - 1);
        }
    }
}