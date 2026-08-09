class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> temp = new ArrayList<>();
        generateCombinations(k,n,0,temp,0);
        return ans;
    }
    public void generateCombinations(int k , int target , int sum , List<Integer> temp , int idx){
        if(temp.size() == k){
            if(sum == target){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i = idx + 1; i <= 9 ; i++){
            temp.add(i);
            generateCombinations(k, target, sum + i, temp, i);
            temp.remove(temp.size() - 1);
        }
    }
}