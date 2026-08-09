class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = nums.length;
        int[] depth = new int[n];
        depth[0] = 1;
        int height = depth[0];
        for(int i = 1 ; i < n ; i++){
            if(depth[i] == 0){
                depthOf(i,parent,depth);
                height = Math.max(height,depth[i]);
            }
        }
        long sum = 0;
        for(int i = 0 ; i < n ; i++){
            sum += (long)nums[i] * (height - depth[i] + 1);
        }
        return sum;
    }
    public void depthOf(int node, int[] parent, int[] depth){
        if(node == 0){
            depth[node] = 1;
            return;
        }
        if(depth[parent[node]] == 0){
            depthOf(parent[node], parent , depth);
        }
        depth[node] = depth[parent[node]] + 1;
    }
}