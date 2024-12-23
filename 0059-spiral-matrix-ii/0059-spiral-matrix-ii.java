class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] spiralMatrix = new int[n][n];
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = n - 1;
        while(top <= bottom && left <= right)
        {
            for(int i = left ; i <= right ; i++)
                spiralMatrix[top][i] = num++;
            top++;
            for(int i = top ; i <= bottom ; i++)
                spiralMatrix[i][right] = num++;
            right--;
            if(top < bottom)
            {
                for(int i = right ; i >= left ; i--)
                    spiralMatrix[bottom][i] = num++;
                bottom--;
            }
            if(left < right)
            {
                for(int i = bottom ; i >= top ; i--)
                    spiralMatrix[i][left] = num++;
                left++;
            }
        }
        return spiralMatrix;
    }
}