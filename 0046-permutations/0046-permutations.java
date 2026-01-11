class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int index = 0;
        List<Integer> num = new ArrayList<>();
        for(int n : nums){
            num.add(n);
        }
        List<List<Integer>> ans = new ArrayList<>();
        permutations(num,ans,index,num.size() - 1);
        return ans;
    }
    public static void permutations(List<Integer> num,List<List<Integer>> ans,int l , int r){
        if(l == r){
            ans.add(new ArrayList<>(num));
            return;
        }
        for(int i = l ; i <= r ; i++){
            swap(num,i,l);
            permutations(num,ans,l+1,r);
            swap(num,i,l);
        }
    }
    public static void swap(List<Integer> num , int x , int y){
        int temp = num.get(x);
        num.set(x,num.get(y));
        num.set(y,temp);
    }
}