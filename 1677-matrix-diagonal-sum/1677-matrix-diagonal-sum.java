class Solution {
    public int diagonalSum(int[][] mat) {
        Solution sol = new Solution();
        int sum = sol.leftDiagonalSum(mat) + sol.rightDiagonalSum(mat);
        if(mat.length % 2 != 0)
        {
            int mid = mat.length/2;
            sum -= mat[mid][mid];
        }
        return sum;
    }
    public int leftDiagonalSum(int[][] mat)
    {
        int leftSum = 0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            leftSum += mat[i][i];
        }
        return leftSum;
    }
    public int rightDiagonalSum(int[][] mat)
    {
        int rightSum = 0;
        for(int i = 0 ; i < mat.length ; i++)
        {
            int j = mat.length - 1 - i;
            rightSum += mat[i][j];
        }
        return rightSum;
    }
}