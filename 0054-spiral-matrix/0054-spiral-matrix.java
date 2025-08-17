class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0 , left = 0 ;
        int right = matrix[0].length - 1 , bottom = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        while(list.size() < matrix.length * matrix[0].length){
            for(int i = left ; i <= right ; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= bottom ; i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right ; i >= left ; i--){
                list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom ; i >= top ; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}