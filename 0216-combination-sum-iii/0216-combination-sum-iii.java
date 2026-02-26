class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateCombinations(k,n,ans,temp,0,1);
        return ans;
    }
    public void generateCombinations(int k, int n, List<List<Integer>> ans,
    List<Integer> temp, int sum, int num){
        if(temp.size() == k){
            if(sum < n){
                return;
            }
            else if (sum > n){
                num = 10;
            }
            else{
                List<Integer> res = new ArrayList<>(temp);
                ans.add(res);
                num = 10;
            }
        }
        for(int i = num ; i <= 9 ; i++){
            if(temp.size() > 0){
                if(temp.get(temp.size()-1) < i){
                    temp.add(i);
                    generateCombinations(k,n,ans,temp,sum+i,num+1);
                    temp.remove(temp.size() - 1);
                }
            }
            else{
                temp.add(i);
                generateCombinations(k,n,ans,temp,sum + i,num+1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}