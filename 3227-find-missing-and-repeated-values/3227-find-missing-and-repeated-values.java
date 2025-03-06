class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        int[] map = new int[n*n];
        int missing = 0;
        for(int[] row : grid){
            for(int col : row){
                map[col-1]++;
                if(map[col-1] == 2){
                    ans[0] = col;
                }
            }
        }
        while(map[missing] >= 1)
            missing++;
        ans[1] = missing + 1;
        return ans;
    }
}