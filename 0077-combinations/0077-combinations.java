class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateCombinations(n,k,ans,temp,1);
        return ans;
    }
    public void generateCombinations(int n, int k, List<List<Integer>> ans, List<Integer> temp, int i){
        if(temp.size() == k){
            List<Integer> res = new ArrayList<>(temp);
            ans.add(res);
            return;
        }
        for(;i <= n;i++){
            temp.add(i);
            generateCombinations(n,k,ans,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}