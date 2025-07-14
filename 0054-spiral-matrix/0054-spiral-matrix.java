class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length;
        int top = 0 , left = 0;
        int bottom = n - 1 , right = m - 1;
        List<Integer> spiral = new ArrayList<>();
        while(spiral.size() < m * n){
            for(int i = left ; i <= right ; i++){
                spiral.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                spiral.add(matrix[i][right]);
            }
            right--;
            if(top > bottom)
                break;
            for(int i = right ; i >= left ; i--){
                spiral.add(matrix[bottom][i]);
            }
            bottom--;
            if(left > right)
                break;
            for(int i = bottom ; i >= top ; i--){
                spiral.add(matrix[i][left]);
            }
            left++;
        }
        return spiral;
    }
}