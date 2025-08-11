class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[] newGrid = new long[n * m];
        int idx = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                newGrid[idx++] = grid[i][j];
            }
        }
        long[] prefix = new long[n * m];
        long[] suffix = new long[n * m];
        prefix[0] = suffix[n * m - 1] = 1;
        for(int i = 1 ; i < m * n ; i++){
            prefix[i] = (prefix[i - 1] * newGrid[i - 1]) % 12345;
            suffix[n * m - i - 1] = (suffix[n * m - i] * newGrid[n * m - i]) % 12345;
        }
        for(int i = 0 ; i < n * m ; i++){
            newGrid[i] = ((prefix[i] % 12345) * (suffix[i] % 12345)) % 12345;
            //newGrid[i] %= 12345;
        }
        idx = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                grid[i][j] = (int)newGrid[idx++];
            }
        }
        return grid;
    }
}