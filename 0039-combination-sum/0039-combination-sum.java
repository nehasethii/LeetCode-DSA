class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        generateCombinations(candidates, target, 0, 0, temp);
        return ans;
    }
    public void generateCombinations(int[] candidates , int target, int sum,int i,
    List<Integer> temp){
        if(sum > target){
            return;
        }
        if(sum == target){
            //Collections.sort(temp);
            if(!ans.contains(temp)){
                List<Integer> combination = new ArrayList<>(temp);
                ans.add(combination);
                return;
            }
        }
        for(; i < candidates.length ; i++){
            temp.add(candidates[i]);
            generateCombinations(candidates, target, sum + candidates[i], i, temp);
            temp.remove(temp.size() - 1);
        }
        return;
    }
}