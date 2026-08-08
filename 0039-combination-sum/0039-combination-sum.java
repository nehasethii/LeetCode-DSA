class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        findCombinationSum(candidates , 0 , target , 0 , temp);
        return ans;
    }
    public void findCombinationSum(int[] candidates , int idx , int target , int sum , List<Integer> temp){
        if(sum > target){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ; i < candidates.length ; i++){
            if(i < idx){
                continue;
            }
            temp.add(candidates[i]);
            findCombinationSum(candidates, i , target , sum + candidates[i] , temp);
            temp.remove(temp.size() - 1);
        }
    }
}