class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public int numSquarefulPerms(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        permute(nums,temp,visited);
        return ans.size();
    }
    public void permute(int[] nums, List<Integer> temp, boolean[] visited){
        if(temp.size() == nums.length){
            List<Integer> permutation = new ArrayList<>(temp);
            ans.add(permutation);
            return;
            // if(!ans.contains(temp)){
            //     List<Integer> permutation = new ArrayList<>(temp);
            //     ans.add(permutation);
            //     return;
            // }
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]){
                continue;
            }
            if(!visited[i]){
                if(temp.size() == 0){
                    visited[i] = true;
                    temp.add(nums[i]);
                    permute(nums,temp,visited);
                    temp.remove(temp.size() - 1);
                    visited[i] = false;
                }
                else{
                    int n1 = temp.get(temp.size() - 1) + nums[i];
                    int n2 = (int)Math.sqrt(n1);
                    if((n2 * n2) == n1){
                        visited[i] = true;
                        temp.add(nums[i]);
                        permute(nums,temp,visited);
                        temp.remove(temp.size() - 1);
                        visited[i] = false;
                    }
                }
            }
        }
        return;
    }
}