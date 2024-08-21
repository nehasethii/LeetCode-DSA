class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length * mat[0].length) != (r * c))
            return mat;
        int[][] reshapedMat = new int[r][c];
        int[] matrix = new int[mat.length * mat[0].length];
        for(int i = 0 ; i < mat.length ; i++)
        {
            for(int j = 0 ; j < mat[i].length ; j++)
            {
                matrix[mat[i].length * i + j] = mat[i][j];
            }
        }
        for(int i = 0 ; i < matrix.length ; i++)
        {
            int col = reshapedMat[0].length;
            reshapedMat[i / col][i % col] = matrix[i];
        }
        return reshapedMat;
    }
}