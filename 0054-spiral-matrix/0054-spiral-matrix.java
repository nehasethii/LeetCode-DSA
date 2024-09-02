class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralMatrix = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, left = 0, right = cols - 1, bottom = rows - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                spiralMatrix.add(matrix[top][i]);
            top++;
            for (int j = top; j <= bottom; j++)
                spiralMatrix.add(matrix[j][right]);
            right--;
            if (top <= bottom) {
                for (int k = right; k >= left; k--)
                    spiralMatrix.add(matrix[bottom][k]);
                bottom--;
            }
            if (left <= right) {
                for (int l = bottom; l >= top; l--)
                    spiralMatrix.add(matrix[l][left]);
                left++;
            }
        }
        return spiralMatrix;
    }
}