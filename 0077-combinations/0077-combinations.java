class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        generateCombinations(n,k,1,temp);
        return ans;
    }
    public void generateCombinations(int n , int k , int idx , List<Integer> temp){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 1 ; i <= n ; i++){
            if(i < idx){
                continue;
            }
            temp.add(i);
            generateCombinations(n,k,i+1,temp);
            temp.remove(temp.size() - 1);
        }
    }
}