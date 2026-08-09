class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[n];
        generateCombinations(candidates,target,0,temp,visited,0);
        return ans;
    }
    public void generateCombinations(int[] candidates, int target, int sum, List<Integer> temp, boolean[] visited , int idx){
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
            if(i > 0 && candidates[i] == candidates[i-1] && !visited[i-1]){
                continue;
            }
            if(!visited[i]){
                visited[i] = true;
                temp.add(candidates[i]);
                generateCombinations(candidates, target, sum + candidates[i], temp, visited, i);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}