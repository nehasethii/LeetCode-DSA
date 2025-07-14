class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0 , left = 0;
        int bottom = n - 1 , right = n - 1;
        int[][] spiral = new int[n][n];
        int count = 1;
        while(count <= n * n){
            for(int i = left ; i <= right ; i++){
                spiral[top][i] = count++;
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                spiral[i][right] = count++;
            }
            right--;
            if(top > bottom)
                break;
            for(int i = right ; i >= left ; i--){
                spiral[bottom][i] = count++;
            }
            bottom--;
            if(left > right)
                break;
            for(int i = bottom ; i >= top ; i--){
                spiral[i][left] = count++;
            }
            left++;
        }
        return spiral;
    }
}