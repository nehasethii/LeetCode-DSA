class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int lb = 0; 
        int ub = grid[lb].length - 1;
        while(lb < grid.length && ub >= 0)
        {
            if(grid[lb][ub] < 0)
            {
                count += grid.length - lb;
                ub--;
            }
            else
                lb++;
        }
        return count;
    }
}